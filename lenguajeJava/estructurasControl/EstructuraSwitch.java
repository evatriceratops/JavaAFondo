package lenguajeJava.estructurasControl;
import java.util.Scanner;

public class EstructuraSwitch {
    public static void main (String[] args){
        // SWITCH
        Scanner scanner = new Scanner (System.in);
        int iDia = scanner.nextInt();

        String sDia = "";
        switch(iDia){
            case 1:
		sDia = "Lunes";
		break;
        case 2:
            sDia = "Martes";
            break;
        case 3:
            sDia = "Miércoles";
            break;
        case 4:
            sDia = "Jueves";
            break;
        case 5:
            sDia = "Viernes";
            break;
        case 6:
            sDia = "Sábado";
            break;
        case 7:
            sDia = "Domingo";
            break;
        
        default:
            sDia = "valor incorrecto";
        // ...
        }
        System.out.println(iDia + " es: " + sDia);

        scanner.close();
    }
}
