public class Ejercicios{
    public static void main(String[] args){

        System.out.println("Convertidor de temperatura");

        int temperaturaCelcius = 18;
        double temperaturaFahrenheit = (double) (temperaturaCelcius* 1.8) + 32;
        String texto;
        texto = """
                %d grados Celcius es equivalente a
                %f grados Fahrenheit
                """.formatted(temperaturaCelcius,temperaturaFahrenheit);
        System.out.println(texto);

    //EJERCICIOS PARA PRACTICAR//

    int numero1 = 10;
    int numero2 = 5;
        System.out.println("El resultado de la suma  es:" + (numero2+numero1));
        System.out.println("El resultado de la resta es:" + (numero2-numero1));
        System.out.println("El resultado de la multiplicación es:" + (numero2*numero1));
        System.out.println("El resultado de la división es:" + (numero2/numero1));

//Declaracion de variables
    int num1 = 5;
    int num2 = 5;
//Operaciones
        if (num1>=num2){

            if (num1==num2){
                System.out.println("Los numeros "+num1+" y son "+num2+" son iguales");
            }else{
                System.out.println("El numero"+num1+"es mayor que el numero"+num2);
            }
        }else {
            System.out.println("El numero" + num2 +"es mayor que el numero" + num1);

            String mensaje = "Hola ";
            String nombre = "Moises";

            System.out.println(mensaje + nombre);

            //SWITCH
            int dia = 3;
            switch (dia) {
                case 1:
                    System.out.println("El dia 1 es lunes");
                    break;
                case 2:
                    System.out.println("El día 2 es martes");
                    break;
                case 3:
                    System.out.println("El día 3 es miercoles");
                    break;

                //Otros casos posibles
                default:
                    System.out.println("Día no válido");
            }

        }
    }
}