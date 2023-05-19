package lenguajeJava.operadores;

public class OperadoresLog {
    public static void main (String[] args){
        boolean t = true; // debe ser inicializada
        boolean f = false; // debe ser inicializada
        boolean b;

        // Lógicos
        b = t && f; // AND, Producto lógico
        b = t || f; // OR, Suma lógica
        b = !t;      // Not, Negación (Not[p])

        System.out.println(b);
    }
}
