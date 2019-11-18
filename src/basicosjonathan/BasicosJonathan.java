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
        logicos();
    }
    
}
