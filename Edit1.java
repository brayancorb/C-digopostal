package proyecto2;
import java.util.StringTokenizer;
import java.util.Scanner; 
import java.io.*;

public class Proyecto2 {
    public static void main (String [ ] args){
        StringTokenizer tokens;
        boolean valorboolean = true;
        String postal ="";
        String cadena;
        
        System.out.println("Bienvenido al Servicio Postal el Pony Mensajero");
        System.out.print ("Introduzca su còdigo postal de 5 dígitos: ");
        Scanner input = new Scanner(System.in);
        postal = input.nextLine (); 

        if (postal.length() != 5) {
            System.out.println ("Direcciòn invàlida");
        } else { System.out.println ("Direcciòn vàlida");}

        for (int i=0;i< postal.length(); i++) {
            System.out.print ("Verificando que los nùmeros sean dìgotos: " + postal.charAt(i));  
            if (Character.isDigit(postal.charAt(i)) == false) {
                System.out.println ("  No es un número, entrada no válida");
                valorboolean = false;
                break;
            } else {System.out.println(" "); }
        }
        if (valorboolean == true) {System.out.println ("Todos los caracteres son números"); 
 
        }
        else {System.out.println ("Hay caracteres no numéricos"); }
         try{
            // Abrimos el archivo
            FileReader Fire = new FileReader("C:/Users/Miranda/Downloads/CPdescarga.txt");
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(Fire);
            // Comienza lectura de lineas
            // Leer el archivo linea por linea
            while ((cadena = buffer.readLine())!= null)   {
                String datobuscado = cadena;
                //compara lo ingresado con lo leido
                if (datobuscado.startsWith(postal)){
                    //imprime lo comparado
                    System.out.println("Su direcciòn es: "+datobuscado);
                }
            }
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }

    }
}
    
