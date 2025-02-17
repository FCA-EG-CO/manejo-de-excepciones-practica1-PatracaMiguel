import java.security.AlgorithmConstraints;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       

        Scanner entrada = new Scanner(System.in);
        try{
            int numeroParametro;
            System.out.println("Ingresa un numero entero ");
            numeroParametro = entrada.nextInt();

            if (numeroParametro % 2 == 1) {
                throw new Exception("numero invalido");
            }
            else {
                System.out.println("El numero es valido");
            }
         } catch(Exception ex){
            System.out.println("El numero es inválido");
        }

    }
}

