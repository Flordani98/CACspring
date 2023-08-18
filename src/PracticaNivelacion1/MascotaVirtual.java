package PracticaNivelacion;

import java.time.LocalDateTime;
import java.util.Random;

public class MascotaVirtual {
    private String nombre;
    private int nivel; //>=0

    private Estados estado; //puede ser enum: aburrida, hambrienta o contenta


    public MascotaVirtual(){}

    public MascotaVirtual(String nombre){
        this.nombre = nombre;
        this.nivel = 0;
        this.estado = obtenerEstadoRandom();

    }

    //Obtener un estado random
    public Estados obtenerEstadoRandom(){
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

    @Override
    public String toString() {
        return "-Mascota Virtual- " +
                "\nNombre: " + nombre +
                "\nNivel: " + nivel +
                "\nEstado: " + estado;
    }

    /*    public void comer(){
        LocalDateTime horaActual = LocalDateTime.now();
        int hora = horaActual.getHour();
        int minutos = horaActual.getMinute();

        if (estado.equals("hambrienta")) {
            estado = "contenta";
        }
        if (estado.equals("contenta")) {
            nivel++;
        }
        if (estado.equals("aburrida")) {
            //verificar cuanto tiempo esta aburrida
            // if(tiempoAburrida < 81 minutos){
            //no se hace nada
//              else{
            //estado = "contenta"
        //}
            //}
        }

    }
    public void jugar(){
        if (estado.equals("hambrienta")) {
            //nada, no puede jugar

        }
        if (estado.equals("contenta")) {
            nivel += 2;
        }
        if (estado.equals("aburrida")) {
            estado = "contenta";
        }

    }*/
}
