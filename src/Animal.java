public class Animal {

    private String nombre;
    private int edad;

    public Animal(){}

    public Animal( String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String moverse(){
        return "El animal se esta moviendo";
    }

    @Override
    public String toString() {
        return "El animal es de nombre " + nombre +
                " y tiene " + edad;
    }
}
