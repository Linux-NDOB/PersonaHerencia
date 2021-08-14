package clases;

import javax.swing.*;

public class Jardinero extends  Persona{

    public int hot;

    public Jardinero(String nombre, int numeroTel, int id, String tipo, int hot) {
        super(nombre, numeroTel, id, tipo);
        this.hot = hot;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public void mostrar(){

        String info="Informacion del jardinero: \n";
        info += "id: "+id+"\n";
        info += "nombre: "+nombre+"\n";
        info += "tipo: "+tipo+"\n";
        info += "numT: "+numeroTel+"\n";
        info += "horas trabajadas:"+hot+"\n";

        JOptionPane.showMessageDialog(null, info);
    }

    public void accion(){

        String info="El jardinero de nombre " + nombre + "Está cortando el cesped";

        JOptionPane.showMessageDialog(null, info);
    }


}
