import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100); //Numero aleatorio del 0 al 100
       //int intentosUsuario = 5;
        int numeroIngresado = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Adivina el número del 0 al " + numeroAleatorio + ": ");
            numeroIngresado = teclado.nextInt();
            if (numeroAleatorio == numeroIngresado) {
                System.out.println("Felicidades adivinaste el número, el número es: " + numeroAleatorio);
                break;
            } else if ( numeroAleatorio > numeroIngresado) {
                System.out.println("El número es mayor " + " te quedan " + ( 4 - i + " intentos"));
            }else if (numeroAleatorio < numeroIngresado){
                System.out.println("El número es menor");
                System.out.println("Te quedan: " + ( 4 - i + "intentos"));
            }
        }
    }
}
    /*while (intentosUsuario <= 5){
        System.out.println(String.format("Te quedan %d intentos",intentosUsuario));
intentosUsuario++;*/