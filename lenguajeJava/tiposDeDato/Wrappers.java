package lenguajeJava.tiposDeDato;

// Los Wrappers son clases que representan a los tipos primitivos
public class Wrappers {
    public static void main (String[] args){
    int i = 1234;
    String a = Integer.toString(i);
    System.out.println(a); // Salida: 1234

    String b = Integer.toBinaryString(i);
    System.out.println(b); // Salida: 10011010010

    String c = Integer.toHexString(i);
    System.out.println(c); // Salida: 4D2

    String d = "12321";

    int j = Integer.parseInt(d);
    System.out.println(j);  // Salida: 12321
    
    }

}
