package lenguajeJava.tiposDeDato;

// Conversión automática entre tipos primitivos y wrappers
public class Autoboxing {
    public static void main (String[] args){
        Integer i = new Integer(1234); //DEPRECATED
        int j = i;
        System.out.println(j); // Salida: 1234

        int n = new Integer(567); //DEPRECATED
        System.out.println(n); // Salida: 567
    }
}
