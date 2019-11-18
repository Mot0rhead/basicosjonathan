/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicosjonathan;

/**
 *
 * @author ALU1J
 */
public class BasicosJonathan {

     public static void numericos(){
        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
   }
    public static void logicos(){
        boolean x=false;
        int a=9,b=7;
        if(a>b){
            x=true;
            System.out.println(a+" es mayor que "+b+" "+x);
        }else{
            
            System.out.println(b+"es mayor que "+a+x);//en este caso x ya es igual a false y por eso no pongo x=false;
        }
    }
    public static void main(String[] args) {
        numericos();
        logicos();
    }
    
}
