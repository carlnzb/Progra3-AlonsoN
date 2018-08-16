package project_hotel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class checkout {
    String Comentarios;
    int Cobrar;

    public checkout(String Comentarios, int Cobrar) {
        this.Comentarios = Comentarios;
        this.Cobrar = Cobrar;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }

    public int getCobrar() {
        return Cobrar;
    }

    public void setCobrar(int Cobrar) {
        this.Cobrar = Cobrar;
    }
}