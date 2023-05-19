package lenguajeJava.funcionesEstaticas;
import java.util.Scanner;

// La clase *Funciones declara y resuelve los métodos *factorial y *esPrimo
public class FuncionesEstaticas {

    // Calcular el factorial de n
    public static double factorial(int n){
        double r=1;
        for (int i=2; i<=n; i++){
            r=r*i;
        }
    return r;
    }

    // Determinar si n es un número primo o no
    public static boolean esPrimo (int n){
        int i=2;
        while ( n%i!=0 && i<n ){
            i++;
        }

        // Si i es igual a n entonces: i == n es true
        return i==n;
    }

    //Ahora el método *main invoca a los métodos *factorial y *esPrimo
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        // El usuario ingresa un valor
        System.out.println("Ingrese un valor: ");
        int n	= scanner.nextInt();
        
        //Calcular su factorial
        double f = factorial(n);
        System.out.println("Factorial de " + n + ": " + f);
        
        //Determinar si es o no un número primo
        boolean p = esPrimo(n);
        
        // if en linea
        String resultado = p?" es ": " no es ";
        System.out.println(n + resultado + "primo");
        
        scanner.close();
    }
        
}
