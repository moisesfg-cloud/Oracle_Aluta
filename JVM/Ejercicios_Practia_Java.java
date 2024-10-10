import java.util.Scanner;

public class Ejercicios_Practia_Java {
    public static void main(String[] args) {
//        Scanner lector = new Scanner(System.in);
//        String cadena;
//        System.out.println("Cual es tu nombre: ");
//        cadena = lector.nextLine();
//        System.out.println("Buenos días " + cadena);
//
//        //Ejercicio número par número impar
//
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Ingresa un número: ");
//        int numero = teclado.nextInt();
//        if (numero % 2 != 0) {
//            System.out.println("El numero: " + numero + " es impar");
//        } else {
//            System.out.println("El numero: " + numero + " es par");
//        }
//
//        Scanner lectura = new Scanner((System.in));
//        System.out.println("Ingresa un número: ");
//        int n1 = lectura.nextInt();
//        System.out.println("Ingresa el segundo número: ");
//        int n2 = lectura.nextInt();
//        if (n1 > n2) {
//            System.out.println(n1 + " es mayor que " + n2);
//        } else if (n1 == n2) {
//            System.out.println("Los números que ingresaste son iguales");
//        } else {
//            System.out.println(n2 + " es mayor que " + n1);
//        }
//
//
//        System.out.println("Número mayor_menor que");
//        Scanner leer = new Scanner((System.in));
//        System.out.println("Ingresa el primer número: ");
//        int num1 = leer.nextInt();
//        System.out.println("Ingresa el segundo número: ");
//        int num2 = leer.nextInt();
//        System.out.println("Ingresa el tercer número: ");
//        int num3 = leer.nextInt();
//
//        int mayor = Math.max(num1, Math.max(num2, num3));
//        System.out.println("El número mayor es: " + mayor);
//
//        int numeroEntero = 10;
//        System.out.println(numeroEntero);
//        numeroEntero = 5;
//        System.out.println(numeroEntero);

        Scanner lector = new Scanner(System.in);
        //INGRESO DE TODAS LAS CALIFICAICONES
        System.out.println("Ingresa tu primera calificacion: ");
        double calif1 = lector.nextDouble();
        System.out.println("Ingresa tu segunda calificacion: ");
        double calif2 = lector.nextDouble();
        System.out.println("Ingresa tu tercera calificacion: ");
        double calif3 = lector.nextDouble();
        System.out.println("Ingresa tu cuarta calificacion: ");
        double calif4 = lector.nextDouble();
        System.out.println("Ingresa tu quinta calificacion: ");
        double calif5 = lector.nextDouble();
        double promedio = calif1 + calif2 + calif3 + calif4 + calif5 / 5; //SUMA DE LAS CALIFICACIONES
        System.out.println(promedio);


        //CONVERSION DE ENTERO A BINARIO
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numeroDecimal = lectura.nextInt();
        String numeroBinario = Integer.toBinaryString(numeroDecimal);
        System.out.println("El número " + numeroDecimal + "en binario es: " + numeroBinario);

        }
    }
//}