package Entrega1;
import java.util.Scanner;

/*
 * Ejercicio de Conversión de moneda
 * Integrante: Daniela Zuluaga Vasquez
 * Cedula: 1152693761
 * Correo:  dzuluagav@poligran.edu.co
 * 
 * */

public class ConversionMoneda {

	// Programa principal
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dinero: ");
        double p = teclado.nextDouble();

        double valor8AM = conversionAlas8AM(p);
        double valorMediodia = conversionAlMediodía(p);

        System.out.println("Cantidad a las 8:00 a.m.: " + valor8AM);
        System.out.println("Cantidad al mediodía: " + valorMediodia);

        teclado.close();
    }


    // A. Conversión a las 8:00 a.m.
    public static double conversionAlas8AM(double p) {
        return p;
    }

    // B. Conversión al mediodía con disminución del 10%
    public static double conversionAlMediodía(double p) {
        return p * 0.90;
    }

    
}