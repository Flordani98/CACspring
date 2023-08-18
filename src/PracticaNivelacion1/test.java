package PracticaNivelacion1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class test {
    public static void main(String[] args) {
//        System.out.println("Bienvenido a 'Crea tu mascota virtual!'");
//        System.out.println("1. Crear mascota");
//        System.out.println("Ingrese un nombre para su mascota:");

        probandoEstadosMascota();
//        probandoRandom();

    }
    public static void probandoFormatoHora(){
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String horaActualString = horaActual.format(formatter);
        System.out.println(horaActualString);
    }
    public static void probandoEstadosEnum(){
        System.out.println(Estados.CONTENTO);
    }

    public static void probandoEstadosMascota(){
        MascotaVirtual mascota = new MascotaVirtual("Negrita");
        System.out.println(mascota);
        System.out.println("----------------------------------------");
        mascota.comer();
        System.out.println(mascota);
        System.out.println("----------------------------------------");
        mascota.comer();
        System.out.println(mascota);
        System.out.println("----------------------------------------");



    }

    public static void probandoRandom(){
        Random numAleatorio = new Random();
        int num = numAleatorio.nextInt(1, 4);
        System.out.println(num);

    }
}
