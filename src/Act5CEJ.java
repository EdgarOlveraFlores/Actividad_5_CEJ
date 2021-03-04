import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class Act5CEJ {
    public static void main(String[] args) {

        //Declaramos e instanciamos las variables 'x' y 'y'
        int x = 0 , y =0;
        //Declaramos e instanciamos la variable que almacenara el resultado
        int result;

        //Con esta clase scanner podremos almacenar datos en nuestras variables
        Scanner entrada = new Scanner(System.in);


        //Solicitamos en pantalla el ingreso del dato X
        System.out.println("Ingresa valor de X: ");

        //Almacenados el datos del usuario
        x = entrada.nextInt();

        //Solicitamos en pantalla el ingreso del dato Y
        System.out.println("Ingresa valor de Y: ");
        y = entrada.nextInt(); //nextFloat()

        //Mostrando en pantalla...
        System.out.println("X: "+ x);
        System.out.println("Y: "+ y);

        //Operaciones
        result = x+y;
        System.out.println("Suma: "+result);

        result = x- y;
        System.out.println("Resta: "+result);

        result = x* y;
        System.out.println("Multiplicacion: "+result);

        result = x / y;
        System.out.println("Division: "+result);

        result = x% y;
        System.out.println("Modulo: "+result);

    }
}
