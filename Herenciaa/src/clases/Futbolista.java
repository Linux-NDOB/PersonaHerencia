package clases;

import javax.swing.*;

public class Futbolista extends  Persona{

    public String nombreE;

    public Futbolista(String nombre, int numeroTel, int id, String tipo, String nombreE) {
        super(nombre, numeroTel, id, tipo);
        this.nombreE = nombreE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public void mostrar(){

        String info="Informacion del Deportista: \n";
        info += "id: "+id+"\n";
        info += "nombre: "+nombre+"\n";
        info += "tipo: "+tipo+"\n";
        info += "numT: "+numeroTel+"\n";
        info += "Nombre del equipo:"+nombreE+"\n";

        JOptionPane.showMessageDialog(null, info);
    }

    public void accion(){

        String info="El Futbolista " + nombre + " está en un partido";

        JOptionPane.showMessageDialog(null, info);
    }
}
