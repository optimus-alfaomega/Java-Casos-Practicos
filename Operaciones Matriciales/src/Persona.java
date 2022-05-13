public class Persona {
    private String nombre;
    private int edad;
    private boolean genero;

    public Persona() {

        this.nombre = "por definir";
        this.edad = 0;
        this.genero = false;

    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

}
