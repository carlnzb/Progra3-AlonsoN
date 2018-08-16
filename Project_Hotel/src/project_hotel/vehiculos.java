package project_hotel;

import java.util.ArrayList;

public class vehiculos {  
    String tipoMarca;
    String tipoModelo;
    String año;
    int cantDias;
    double precioDia;
    int vehiculosDisponibles;

    public vehiculos(String tipoMarca, String tipoModelo, String año, int cantDias, double precioDia, int vehiculosDisponibles) {
        this.tipoMarca = tipoMarca;
        this.tipoModelo = tipoModelo;
        this.año = año;
        this.cantDias = cantDias;
        this.precioDia = precioDia;
        this.vehiculosDisponibles = vehiculosDisponibles;
    }

    public String getTipoMarca() {
        return tipoMarca;
    }

    public void setTipoMarca(String tipoMarca) {
        this.tipoMarca = tipoMarca;
    }

    public String getTipoModelo() {
        return tipoModelo;
    }

    public void setTipoModelo(String tipoModelo) {
        this.tipoModelo = tipoModelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public int getVehiculosDisponibles() {
        return vehiculosDisponibles;
    }

    public void setVehiculosDisponibles(int vehiculosDisponibles) {
        this.vehiculosDisponibles = vehiculosDisponibles;
    }



    
}