import java.util.Scanner; 
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;

public class Proyecto2 {
    public static void main (String [ ] args){
        boolean valorboolean = true;
        String postal ="";
        System.out.println("Bienvenido");
        System.out.print ("Introduzca su còdigo postal de 5 dígitos: ");
        Scanner input = new Scanner(System.in);
        postal = input.nextLine (); 
        //con ayuda del metodo .lenght verifica que sean 5 numeros
        if (postal.length() != 5) {
            System.out.println ("Error ingresaste mal tu còdigo");
        } else { System.out.println ("Bien");}
        //con ayuda de este for recorre el codigo y ve si son numeros
        for (int i=0;i< postal.length(); i++) {
            System.out.print (Verificando que sean numeros: " + postal.charAt(i));  
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
            FileInputStream fistream = new FileInputStream("C:/Users/Miranda/Downloads/CPdescarga.txt");//cambia la direccion del archivo
            // Creamos el objeto de entrada
            DataInputStream entrada = new DataInputStream(fistream);
            // Creamos el Buffer de Lectura
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String strLinea;
            // Leer el archivo linea por linea
            while ((strLinea = buffer.readLine()) != null)   {
                // Imprimimos la línea por pantalla
                System.out.println (strLinea);
            }
            // Cerramos el archivo
            entrada.close();
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }
}
    
