//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11

package spp.rriverab.a03p1;

import java.util.Scanner;
import java.lang.Math;

public class SPPRRiveraBA03P1 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        double a, b, c, theta;
        
        System.out.println("Calculadora de Ley de Cosenos usando funciones Math.pow ,  Mat.sqrt y Math.cos \n");
        
        System.out.println("Introduzca el valor del primer lado: ");
        a = teclado.nextDouble();
        System.out.println("Introduzca el valor del segundo lado: ");
        b= teclado.nextDouble();
        System.out.println("Introduzca el valor del ángulo entre los lados: ");
        theta = teclado.nextDouble();
        
        
        c = Math.sqrt(Math.pow(a,2) + Math.pow (b,2) -2*a*b*Math.cos(theta*Math.PI/180.0));
        
        System.out.println("El valor deL tercer lado es: " +c);
    }
    
}
