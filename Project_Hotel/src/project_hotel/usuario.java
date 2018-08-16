package project_hotel;

public class usuario {
   public String nombre;
   public String apellido;
   public int cedula;
   public int fechaIng;
   public int CantDias;



    public usuario(String nombre, String apellido, int cedula, int fechain) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaIng = fechaIng;
        this.CantDias = CantDias;
    }


    public String toString(){
        return "Usuario"
                +"\n Nombre: " + getNombre()
                +"\n Apellido: " + getApellido()
                +"\n Cedula: " + getCedula()
                +"\n Fecha Del Dia del Alquiler: " + getFechaIng()
                +"\n Cantidad de Dias : " + getCantDias();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(int fechaIng) {
        this.fechaIng = fechaIng;
    }

    public int getCantDias() {
        return CantDias;
    }

    public void setCantDias(int CantDias) {
        this.CantDias = CantDias;
    }

}