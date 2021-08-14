package clases;

import javax.swing.*;

public class Doctor extends Persona{

    public int añosEx;

    public String especi;


    public Doctor(String nombre, int numeroTel, int id, String tipo, int añosEx, String especi) {
        super(nombre, numeroTel, id, tipo);
        this.añosEx = añosEx;
        this.especi = especi;
    }


    public int getAñosEx() {
        return añosEx;
    }

    public void setAñosEx(int añosEx) {
        this.añosEx = añosEx;
    }

    public String getEspeci() {
        return especi;
    }

    public void setEspeci(String especi) {
        this.especi = especi;
    }

    public void mostrar(){

        String info="Informacion del Profesionista: \n";
        info += "id: "+id+"\n";
        info += "nombre: "+nombre+"\n";
        info += "tipo: "+tipo+"\n";
        info += "numT: "+numeroTel+"\n";
        info += "Años de ex:"+añosEx+"\n";
        info += "Años de ex:"+especi+"\n";

        JOptionPane.showMessageDialog(null, info);
    }

    public void accion(){

        String info="El  Doctor " +  nombre + " Está atendiendo un paciente";

        JOptionPane.showMessageDialog(null, info);
    }



}
