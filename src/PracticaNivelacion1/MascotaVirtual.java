package PracticaNivelacion1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static PracticaNivelacion1.Herramienta.horaActual;
import static PracticaNivelacion1.Herramienta.obtenerEstadoRandom;
//TODO: realiza punto 2 de la practica de nivelacion, tests unitarios

public class MascotaVirtual {
    private String nombre;
    private int nivel; //>=0
    private Estados estado; //puede ser enum: aburrida, hambrienta o contenta
    private LocalTime horaEstadoActual; //hora en la que se le asigno el estado actual


    //region CONSTRUCTORES
    public MascotaVirtual(){}

    public MascotaVirtual(String nombre){
        this.nombre = nombre;
        this.nivel = 0;
        this.estado = obtenerEstadoRandom();
        this.horaEstadoActual = horaActual();

    }

    //endregion

    //region GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public LocalTime getHoraEstadoActual() {
        return horaEstadoActual;
    }

    public void setHoraEstadoActual(LocalTime horaEstadoActual) {
        this.horaEstadoActual = horaEstadoActual;
    }
//endregion


    //region METODOS
    public void comer(){

        switch (estado) {
            case HAMBRIENTO -> setEstado(Estados.CONTENTO);
            case CONTENTO -> nivel++;
            case ABURRIDO -> {
                LocalTime hora = horaActual();
                int segundosActual = hora.getSecond();
                int tiempoSegundosEstado = horaEstadoActual.getSecond();
                if ((segundosActual - tiempoSegundosEstado) > 20) {
                    setEstado(Estados.CONTENTO);
                }
            }
            default -> System.out.println("Error, la mascota no tiene un estado preedefinido");
        }

        setHoraEstadoActual(horaActual());
    }

    public void jugar(){

        switch (estado) {
            case HAMBRIENTO -> System.out.println("Estoy hambrienta y no puedo jugar");
            case CONTENTO -> nivel += 2;
            case ABURRIDO -> setEstado(Estados.CONTENTO);
            default -> System.out.println("Error, la mascota no tiene un estado preedefinido");
        }

        setHoraEstadoActual(horaActual());
    }

    //endregion

    @Override
    public String toString() {
        return "-Mascota Virtual- " +
                "\nNombre: " + nombre +
                "\nNivel: " + nivel +
                "\nEstado: " + estado +
                "\nHora del estado actual de la mascota: " + horaEstadoActual;
    }



}
