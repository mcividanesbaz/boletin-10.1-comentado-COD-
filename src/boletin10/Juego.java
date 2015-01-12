
package boletin10;

import javax.swing.JOptionPane;

/**
 *este juego calcula numeros aleatorios para que adivines el numero
 * @author mcividanesbaz
 * @version 5.0
 */
public class Juego {
       private int intentos,jugador1, jugador2;
       private  boolean perdedor=true; 

    /**
     *este es el constructor sin parametros
     */
    public Juego(){
    jugador1=0;
    jugador2=0;
    
    }

    /**
     *en este metodo introduces  los datos
     */
    public void introducirDatos(){         
        do{
        String respuesta1 =JOptionPane.showInputDialog("introduzca un numero entre 1 y 50 a adivinar: ");
        jugador1= Integer.parseInt(respuesta1);
        }while( jugador1<0||jugador1>50);
        do{
        String respuesta2= JOptionPane.showInputDialog("introduzca el numero de intentos" );
        intentos =Integer.parseInt(respuesta2);
        if (intentos<=0||intentos>20){
            JOptionPane.showMessageDialog(null,"el numero de intentos no puede ser mayor de 20");
        }
        }while(intentos<=0||intentos>20);
 }

    /**
     *en este metodo te calcula las respuestas principales
     */
    public void respuesta(){
       for(int i=0;i!=intentos;i++){
           do{
           String respuesta3 = JOptionPane.showInputDialog("introduzca un numero");
            jugador2=Integer.parseInt(respuesta3);
           }while(jugador2<0||jugador2>50);
            if (jugador2==jugador1){
                perdedor=false;
                JOptionPane.showMessageDialog(null, "has ganado","Enhorabuena", JOptionPane.WARNING_MESSAGE);
             i=intentos-1;
           }else if(jugador2>jugador1){ 
                JOptionPane.showMessageDialog(null,"el numero es menor");   
                }else{
                JOptionPane.showMessageDialog(null,"el numero es mayor");
                }
               } 
if (perdedor==true)
    JOptionPane.showMessageDialog(null,"Eres un pringado","has perdido",JOptionPane.ERROR_MESSAGE);
            
   }  
    
    
    
    
    
}
