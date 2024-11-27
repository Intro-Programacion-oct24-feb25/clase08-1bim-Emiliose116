/*
 * La solución genera la tabla de multiplicar de un número
 * que empiece desde 1 hasta 10.
 * 2 x 1 = 2
 * 2 x 2 = 4
 * 2 x 3 = 6
 * 2 x 4 = 8
 * 2 x 5 = 10
 * 2 x 6 = 12
 * 2 x 7 = 14
 * 2 x 8 = 16
 * 2 x 9 = 18
 * 2 x 10 = 20
 Atención, el límite en la solución es 10, de manera fija.
 Cambiar lo necesario para que el límite sea ingresado por el usuario. 
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int tabla;
        int operacion;
        int contador = 1;
        int limite;
        String cadena = "";
        System.out.println("Ingrese la tabla a generar");
        tabla = entrada.nextInt();
        
        System.out.println("Ingrese el limite a generar");
        limite = entrada.nextInt();
        
        do {
            operacion = tabla * contador;
            cadena = String.format("%s%d x %d = %d\n", cadena, tabla, contador, operacion);
        } while (contador <= limite);
        System.out.printf("%s", cadena);

    }
}
