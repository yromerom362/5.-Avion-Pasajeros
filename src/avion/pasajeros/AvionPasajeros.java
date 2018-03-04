 /* EJERCICIO 5 Avion pasajeros
 * YEISSON ROMERO
 * UNIVERSIDAD EAN
 * CONSTRUCCION DE SOFTWARE GUIA 2
 */
package avion.pasajeros;

/**
 *Ejercicio 5
 * @author YROMERO
 */
import java.util.Scanner;

public class AvionPasajeros {
    
    //Proceso inicial
    
static double vtiquetes(double c, double p){
     
        double V=0;
        
        if (c==1)V=p*450000;
        
        if (c==2)V=p*210000;
        
        if (c==3)V=p*140000;
        
        return V;
        
    }
       
    public static void main(String[] args) {
        
        
       double c1;
       double c2;
       double c3;
       double p1;
       double p2;
       double p3;
       
       //Proceso Final
       
       Scanner Teclado= new Scanner (System.in);
        
       //Entrada Inicial
       
       System.out.println("Digite el número de clase: ");
       c1 = Teclado.nextFloat();
       System.out.println("Numero de pasajeros: ");
       p1 = Teclado.nextFloat();
       
      
       double R1=vtiquetes(c1,p1);
       
       System.out.println("Digite el número de clase: ");
       c2 = Teclado.nextFloat();
       System.out.println("Numero de pasajeros: ");
       p2 = Teclado.nextFloat();
       
       double R2=vtiquetes(c2,p2);
       
       System.out.println("Digite el número de clase: ");
       c3 = Teclado.nextFloat();
       System.out.println("Numero de pasajeros: ");
       p3 = Teclado.nextFloat();
       
       double R3=vtiquetes(c3,p3);
       
       //Entrada final
       
       double R=R1+R2+R3;
       System.out.println("Valor Total : " +R);
       
       //Salida final 
    }  

    
}