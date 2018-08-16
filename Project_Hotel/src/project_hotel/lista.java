package project_hotel;
import javax.swing.JOptionPane;

public class lista {
    private nodo inicio;
    private int tamanio;
    private nodo fin;
    JOptionPane Sc;

    public lista() {
        this.inicio = null;
        this.tamanio = 0;
        this.fin = null;
    }

 public boolean esVacia(){
        if(inicio==null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void insertar(usuario persona){
        nodo status;
        if(esVacia()){
            status = new nodo(persona,null);
            inicio = status;
            fin = status;
        }
        else{
            status = new nodo(persona, null);
            fin.setSiguiente(status);
            fin = status;
        }
        tamanio++;
    }
    
    public void mostrar(){
        int i = 0;
        if(esVacia()){
            JOptionPane.showMessageDialog(null,"La Lista está vacìa");
            return;
        }
        else{
            nodo temporal;
            temporal = inicio;
            while(temporal != null){
                JOptionPane.showMessageDialog(null, temporal.getDato().toString());
                temporal = temporal.getSiguiente();
                JOptionPane.showMessageDialog(null, "Usuario insertado satisfactoriamente");
                i++;
                tamanio = 1;
            }
        }
        tamanio++;
    }
    
     public int getTamanio(){
        return tamanio;                
        
    }
         
       public void eliminar(){
      
        inicio = null;
     
        tamanio = 0;
    }
       public boolean buscar(int referencia){
       
        nodo ini = inicio;
        boolean encontrado = false;
        while(ini != null && encontrado != true){
            if (referencia == ini.getValor()){
                encontrado = true;
            }
            else{
                ini = ini.getSiguiente();
            }
        }
        return encontrado;
       }
       
       public void removerPorPosicion(int posicion){
        if(posicion>=0 && posicion<tamanio){
            if(posicion == 0){
                inicio = inicio.getSiguiente();
            }
            else{
                nodo aux = inicio;
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamanio--;
        }
    }
      
}