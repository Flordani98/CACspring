package PracticaNivelacion1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Herramienta {
    //Obtener un estado random
    public static Estados obtenerEstadoRandom(){
        Estados estado = null;
        Random numAleatorio = new Random();
        int num = numAleatorio.nextInt(1, 4);

        switch (num) {
            case 1 -> estado = Estados.HAMBRIENTO;
            case 2 -> estado = Estados.CONTENTO;
            case 3 -> estado = Estados.ABURRIDO;
            default -> System.out.println("Error");
        }

        return estado;
    }

    public static LocalTime horaActual(){
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return horaActual;
    }
}
