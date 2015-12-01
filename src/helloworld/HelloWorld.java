/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author tarda
 */
public class HelloWorld {


 /**
  * Lanza un dialogo de mensaje de una línea:
  */
 public static void lanzarMensaje(){
  //En la siguiente línea está la magia (es lo que muestra el mensaje).
  JOptionPane.showMessageDialog(null, "¡Hola mundo!");
 }
 
 /**
  * Lanza un dialogo de varias líneas:
  */
 public static void lanzarMensajeVariasLíneas(){
  //Propiedad del sistema para salto de línea:
  String nl = System.getProperty("line.separator");
  //Lanzamos el mensaje:
  JOptionPane.showMessageDialog(null, "Hello World!");
 }
 
 public static void main(String[] args){
  lanzarMensajeVariasLíneas();
 }
 
}
