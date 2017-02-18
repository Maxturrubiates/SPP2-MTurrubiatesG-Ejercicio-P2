/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg.ejercicio.p2;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class SPP2MTurrubiatesGEjercicioP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = solicitaEntero("un número entre 0 y 10: ");
        int fac = 1;
        if (n<=10){ 
            System.out.print(n+" = ");
            for (n = n; n>0; n--){
                System.out.print("(" + n + ")");
                fac = fac * n;
            } System.out.println(" = " + fac);
        } else 
            System.out.println("Fuera de rango");
    }
public static int solicitaEntero(String mensaje){
        Scanner Teclado = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca " + mensaje);
        try{
        varEntera = Teclado.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta ");
            flag=true;
            Teclado.nextLine();
            
        return varEntera;
    }     
    } while (flag); 
    return varEntera;
    }
    
}
