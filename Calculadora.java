package principal;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
	int x,y;
        Scanner sc=new Scanner(System.in);
        String operacion;
        
	System.out.println("Numero 1:");
        x=Integer.parseInt(sc.nextLine());
        System.out.println("Numero 2:");
        y=Integer.parseInt(sc.nextLine());
        
        System.out.println("Suma: "+sumar(x,y));
        System.out.println("Restar: "+restar(x,y));
        System.out.println("Multi: "+multiplicar(x,y));
        System.out.println("Div: "+dividir(x,y));
        
        
    }
    
   