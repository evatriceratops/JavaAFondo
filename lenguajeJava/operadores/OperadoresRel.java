package lenguajeJava.operadores;

public class OperadoresRel {
    public static void main (String[] args){
        int a = 3;
        int b = 5;
        boolean c;

        // Relacionales
        c = a < b;  //true si a<b
        c = a>b;  //true si a>b
        c = a==b; //true si a=b
        c = a<=b; //true si a<=b
        c = a>=b; //true si a>=b
        c = a!=b; //a distinto de b

        System.out.println(c);
    }
}
