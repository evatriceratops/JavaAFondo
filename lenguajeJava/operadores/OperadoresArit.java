package lenguajeJava.operadores;

public class OperadoresArit {
    public static void main (String[] args){
        int a = 3;
        int b = 5;
        int c;

        // Aritméticos
        c = a+b; //suma
        c = a-b; //resta
        c = a*b; //muntiplicación
        c = a/b; //división
        c = a%b; //residuo o resto (o módulo)
        a++;  //a = a+1
        a--;  //a = a-1
        a+=b; //a = a+b
        a-=b; //a = a-b
        a*=b; //a = a*b

        System.out.println(c);
    }
}
