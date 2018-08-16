package project_hotel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Project_Hotel {

    public static void main(String[] args) {
        lista l = new lista();
        ArrayList<vehiculos> ListaVeh = new ArrayList<>();
        int op = 0;
        do{  
        String opcion = JOptionPane.showInputDialog(null, "Menú\n 1-Registrar Cliente\n"
            + "2-Mostrar vehiculos disponibles\n "
            + "3-Mostrar usuarios registrados\n "
            + "4-Realizar pago\n 5-Salir");
        op = Integer.parseInt(opcion);
          
        switch (op){
            case 1:{
                String nombre, apellido;
                int eda, cedula, fechain, mesin, fechaout, cantusuarios;
                nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre: ");
                apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido: ");
                
		
                String cedu = JOptionPane.showInputDialog(null, "Ingrese su cedula: ");
                while (!isNumber(cedu)) {
                cedu = JOptionPane.showInputDialog(null,"Dígito ingresado no valido, favor ingrese de nuevo el dato.");
		}
                
                cedula = Integer.parseInt(cedu);
                String datein = JOptionPane.showInputDialog(null, "Ingrese el dia del alquiler: ");
                while (!isNumber(datein)) {
                datein = JOptionPane.showInputDialog(null,"Dígito ingresado no valido, favor ingrese de nuevo el dato.");
		}
                
                fechain = Integer.parseInt(datein);
                String cant = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dias que uso el vehiculo: ");
                while (!isNumber(cant)) {
                
		}
                
                cantusuarios = Integer.parseInt(cant);
                l.insertar(new usuario(nombre, apellido, cedula, fechain));
                  
                }
            case 2: {
                String vehiculo1 = "Tipo de Marca: " + "Nissan"
                    + "\n Número de autos: " +  "4"
                    + "\n Tipo modelo Maracana: "
                    +"\n Cantidad de Dias: "  + "3"
                    +"\n Precio por Dia: " + "100,000 colones."
                    +"\n Vehiculos disponibles: " + "7";
                    
                
                String vehiculo2 = "Tipo de Marca: " + "Toyota"
                    + "\n Número de camionetas: " +  "4"
                    + "\n Tipo modelo Tundra: "
                    +"\n Cantidad de Dias: "  + "3"
                    +"\n Precio por Dia: " + "250,000 colones."
                    +"\n Vehiculos disponibles: " + "10";
                
                String vehiculo3 = "Tipo de Marca: " + "Hyundai"
                    + "\n Número de busetas: " +  "4"
                    + "\n Tipo modelo Elantra: "
                    +"\n Cantidad de Dias: "  + "3"
                    +"\n Precio por Dia: " + "50,0000 colones."
                    +"\n Vehiculos disponibles: " + "8";
                
                
                JOptionPane.showMessageDialog(null, vehiculo1);
                JOptionPane.showMessageDialog(null, vehiculo2);
                JOptionPane.showMessageDialog(null, vehiculo3);
                             
                break;
                }
             
                case 3: {
                    l.mostrar();
                break;
                }
              
                case 4: {
                String comentarios;
                    comentarios = JOptionPane.showInputDialog(null, "Si desea reportar algún problema en la estadía o al contrario agradecernos, puede indicarlo acá abajo: ");
                    int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número de vehiculos alquilados por el usuario: "));
                    int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de cada vehiculo alquilado: "));
                    int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite las dias que el usuario uso el vehiculo: "));
                
                    int test = n1 * n2;
                    int result = test * n3;
                    JOptionPane.showMessageDialog(null, "El monto a cobrar sería por: " + result);
                break;
                }
              
                case 5: {
                  l.eliminar();
                break;
                }
            }  
        }
        while(op!=5);
    }   
    
    private static boolean AgeValidation(String n){
        try {
            int edad = Integer.parseInt(n);
            if(edad < 18){
                return false;
            }else{
                return true;
            }
        }catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    private static boolean isNumber(String n){
        try {
            Integer.parseInt(n);
            return true;    
        }catch (NumberFormatException nfe) {
            return false;
        }
    }
}