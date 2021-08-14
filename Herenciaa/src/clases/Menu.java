package clases;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {

        public static void main(String[] args) {









            try{
                int Option,Exit;
                        do {

                            Option=Integer.parseInt(JOptionPane.showInputDialog(

                                    "     ----------------Main Menu----------------\n"+"\n"+

                                            "1. Elegir persona \n"+"\n"+

                                            "2. Salir \n   " + " \n" +


                                            " Please enter an option : "));


                            switch(Option){
                                case 1:

                                    try{

                                        String type;
                                        Object TypeA[] = {"Profesional" , "Deportista" , "Oficiario"};
                                        Object P = JOptionPane.showInputDialog(null,"¿tipo de? \n"
                                                        +"Tipo","Opciones",
                                                JOptionPane.QUESTION_MESSAGE,null,TypeA, TypeA[0]);
                                        type = P.toString();

                                        if(P.equals("Profesional")){

                                            String nombre, especi;
                                            int numeroTel,id,añosEx;

                                            nombre = JOptionPane.showInputDialog("Ingrese el nombre del Doctor");


                                            numeroTel = Integer.parseInt(JOptionPane.showInputDialog("Entre numero T"));

                                            id = Integer.parseInt(JOptionPane.showInputDialog("Entre id"));

                                            añosEx = Integer.parseInt(JOptionPane.showInputDialog("Entre años de exp"));

                                            especi = JOptionPane.showInputDialog("Ingrese especializacion");

                                            Doctor Miguel = new Doctor(nombre, numeroTel, id, "Profesionista", añosEx , especi);

                                            Miguel.mostrar();
                                            Miguel.accion();





                                        }else if(P.equals("Deportista")) {

                                            String nombre, nombreE;
                                            int numeroTel,id;

                                            nombre = JOptionPane.showInputDialog("Ingrese el nombre del Doctor");


                                            numeroTel = Integer.parseInt(JOptionPane.showInputDialog("Entre numero T"));

                                            id = Integer.parseInt(JOptionPane.showInputDialog("Entre id"));

                                            nombreE = JOptionPane.showInputDialog("Ingrese nombre del equipo");

                                            Futbolista Jairo = new Futbolista(nombre, numeroTel, id, "Deportista", nombreE);

                                            Jairo.mostrar();
                                            Jairo.accion();

                                        }else if(P.equals("Oficiario")) {

                                                String nombre;
                                                int numeroTel,id,hot;

                                                nombre = JOptionPane.showInputDialog("Ingrese el nombre del Deportista");


                                                numeroTel = Integer.parseInt(JOptionPane.showInputDialog("Entre numero T"));

                                                id = Integer.parseInt(JOptionPane.showInputDialog("Entre id"));

                                                hot = Integer.parseInt(JOptionPane.showInputDialog("Entre hot"));


                                                Jardinero Alex = new Jardinero(nombre, numeroTel, id, "Oficiario", hot);

                                                //Jardinero Alex = new Jardinero("Alex", 345696, 3, "xxxx", 18);

                                                Alex.mostrar();
                                                Alex.accion();

                                        }

                                    }catch(NegativeArraySizeException a) {

                                        JOptionPane.showMessageDialog(null, "Numeros positivos");
                                    }



                                    break;


                                case 2:
                                    Exit=JOptionPane.showConfirmDialog(null, "¿desea salir?");
                                    if (Exit==0) {

                                        break;
                                    }
                                default:

                                    JOptionPane.showMessageDialog(null, "Opcion invalida ");

                                    break;

                            }


                        }while (Option != 2);


                        System.exit(0);


                    } catch(NumberFormatException a){

                        JOptionPane.showMessageDialog(null, "Error, intente de nuevo");


                    }
                }


}
