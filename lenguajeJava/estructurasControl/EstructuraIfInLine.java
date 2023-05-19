package lenguajeJava.estructurasControl;
import java.util.Scanner;

public class EstructuraIfInLine {
    public static void main (String[] args){
        // IF INLINE
        // Pedir la edad por teclado y después emitir mensaje
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Mostrar mensajes diferentes para mayores y menores de 18 años
        String mensaje18 = (edad>=18) ?"Bienvenido":"Confirmas que eres mayor de edad.";
        System.out.println(mensaje18);

        scanner.close();
    }
}
