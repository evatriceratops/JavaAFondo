package lenguajeJava.caracteresEspeciales;

public class CaracteresEspeciales {
    public static void main (String[] args){
        
        String salto = "Un párrafo \nde dos líneas.";
        System.out.println(salto);
        // Salida:
        //Un párrafo
        //de dos líneas.

        String comillas = "El lenguaje \"Java\" es muy bueno.";
        System.out.println(comillas);
        // Salida:
        //El lenguaje "Java" es muy bueno.

        String escape = "El carácter \\ es el carácter de escape.";
        System.out.println(escape);
        // Salida
        //El carácter \ es el carácter de escape.
    }
}
