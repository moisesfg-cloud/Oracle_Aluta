public class apuntes {
    public static void main(String[] args) {

        String saludo = "Hola,";
        String nombre = "Moises!";
        String mensaje = saludo + nombre;
        System.out.println(mensaje);

        //Strings y text blocks
        String contraseña = "12345";
        if (contraseña.equals("12345")) { //equals hace una comparacion para ver si los strings son iguales o similares//
            System.out.println("Acceso autorizado");
        } else {
            System.out.println("Contraseña incorrecta");
        }

        String bloque = """ 
                Esto 
                es un text
                blocks""";
//--------------
        //FORMATO DE TEXTOS//
        String sobrenombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));

        String name = "Moises";
        int número = 19;
        int value = 300;
        System.out.println(String.format("Mi nombre es %s, mi número de jersey es %d y gano por partido %d", name, número, value));

        /*String nombre = “Juan”;
        int aulas = 4;
        String mensaje = """
                Hola, %s!
                Bienvenido al curso de Java.
                Tendremos %d aulas para mostrarte lo que es necesario para que puedas dar tu primeros pasos en este lenguaje""".formatted(nombre, aulas);
        System.out.println(mensaje);
        */

        String apodo = "Moises";
        int materias = 4;
        String texto = """
                Hola, %s!!!
                Bienvenido a la materia número 1 de las %d que llevaras
                Esperamos que te aprendas mucho!!!
                """.formatted(apodo, materias);
        System.out.println(texto);








    }
}