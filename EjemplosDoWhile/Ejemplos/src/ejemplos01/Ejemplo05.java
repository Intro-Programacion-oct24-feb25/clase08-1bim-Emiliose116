/*
 
 */
package ejemplos01;

import java.util.Locale;
import java.util.Scanner;
public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. numero, i[0, n]
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
        
        // 8. potencia <-- 3
        
        // 9. resultado <-- 1
        resultado = 1;

        int contador = 0;
        
        System.out.println("Ingrese el numero a elevar");
            numero = entrada.nextInt();
            
            System.out.println("Ingrese la potencia");
            potencia = entrada.nextInt();

        do {
           
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
