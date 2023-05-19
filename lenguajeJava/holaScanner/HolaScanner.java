package lenguajeJava.holaScanner;
import java.util.Scanner;

public class HolaScanner {
    public static void main (String[] args){
		//Se prepara para leer por teclado
		Scanner scanner = new Scanner (System.in);
		//El usuario ingresa su nombre
		System.out.print("Ingrese su nombre: ");
		String nombre = scanner.nextLine();
		//HolaScanner personalizado
		System.out.println("Ingresa datos, " + nombre + ".");
				

        // INGRESAR OTRO TIPO DE DATOS
        //Ingresar un int
        int n = scanner.nextInt();
        System.out.println(n);

        //Ingresar un double
        double d = scanner.nextDouble();
        System.out.println(d);

        //Ingresar un String
        String s = scanner.next();
        System.out.println(s);

        //Cerrar el scanner
        scanner.close();
    }

}
