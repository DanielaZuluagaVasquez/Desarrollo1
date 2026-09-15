package Entrega1;
import java.util.Scanner;

/*
 * Ejercicio de siglos
 * Integrante: Daniela Zuluaga Vasquez
 * Cedula: 1152693761
 * Correo:  dzuluagav@poligran.edu.co
 * 
 * */

public class Siglos {
	
	 //Programa principal
   public static void main(String[] args) {

       Scanner teclado = new Scanner(System.in);

       System.out.print("Ingrese el año: ");
       int n = teclado.nextInt();
       int numeroSiglo = siglo(n);
       int primerAnho = primer_anho(numeroSiglo);

       System.out.println("El año " + n + " pertenece al siglo " + numeroSiglo);
       System.out.println("El primer año de ese siglo es: " + primerAnho);

       teclado.close();
   }

   // A. Retorna el siglo al que pertenece un año
   public static int siglo(int anho) {
       return (anho - 1) / 100 + 1;
   }

   // B. Retorna el primer año de un siglo
   public static int primer_anho(int siglo) {
       return (siglo - 1) * 100 + 1;
   } 
}
