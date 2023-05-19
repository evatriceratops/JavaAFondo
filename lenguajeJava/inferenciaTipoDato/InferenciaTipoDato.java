package lenguajeJava.inferenciaTipoDato;

public class InferenciaTipoDato {
    public static void main(String[] args){
        var a = 5;   // a es int
        var b = 6;   // b es int
        var c = a+b; // c es int
        System.out.println(); // SALIDA: 11

        var s = a+"+"+b+"+="+c; // s es String
        System.out.println(s); // SALIDA es 5+6=11
    }
}
