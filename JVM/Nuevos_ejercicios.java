import java.util.Scanner;

public class Nuevos_ejercicios {
    public static void main(String[] args) {

        //Programa Java que lea un nombre y muestre por pantalla: “Buenos  dias nombre_introducido”

//        System.out.println("Saludando a las personas");
//        Scanner lector = new Scanner(System.in);
//        System.out.println("Escribe el primer nombre: ");
//        String nombre1 = lector.next();
//        System.out.println("Escribe el segundo nombre: ");
//        String nombre2 = lector.next();
//
//        System.out.println("Hola " + nombre1 + " e " + nombre2);


        //Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número

//        Scanner ns = new Scanner(System.in); // Importamos la herramienta de Scanner para leer los valores
//        System.out.println("Ingresa el primer valor: "); //Solicitud para que usuario ingrese el primer valor
//        int n1 = ns.nextInt(); //Se encarga de leer el primer valor
//        System.out.println("Número introducido: " + n1);
//        System.out.println("El doble del número: " + n1 + "->" + 2*n1);
//        System.out.println("El triple del número: " + n1 + "->" + 3*n1);


           String Venta venta1 = new Venta();
            venta1.producto = "Camiseta";
           int venta1.cantidad = 2;
            venta1.valorUnitario = 25.50;

            System.out.println("Valor total de la venta " + venta1.cantidad * venta1.valorUnitario);

    }
}
