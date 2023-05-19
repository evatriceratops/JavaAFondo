package programacionOrientadaObjetos.poo;

public class Introduccion {
    // Ejemplo de cadena que almacena datos y puede indicar la posición de la primera ocurrencia de un carácter dentro de la cadena.
    public static void main(String[] args){
        // Ejemplo
        String a = "Patata";
        int i = a.indexOf('P'); // asigna 1 a la variable i
        System.out.println(i);
        
        // Otra forma de plantearlo sería:
        int o = "Patata".indexOf("t");
        System.out.println(o);
    }
}
