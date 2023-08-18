package PracticaNivelacion;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public enum Estados {
    //cada estado tenga su nombre y el tiempo que esta corriendo se guarde
    //dinamicamente
    CONTENTO("Contenta", horaActual()),
    HAMBRIENTO("Hambriento", horaActual()),
    ABURRIDO("Aburrido", horaActual());

    private final String nombre;
    private final String tiempoTranscurrido;

    Estados(String nombre, String tiempoTranscurrido){
        this.nombre = nombre;
        this.tiempoTranscurrido = tiempoTranscurrido;



    }
    public static String horaActual(){
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
       return horaActual.format(formatter);
    }

    @Override
    public String toString() {
        return nombre + "\nHora en la que inicia el estado: "
                + horaActual();
    }
}
