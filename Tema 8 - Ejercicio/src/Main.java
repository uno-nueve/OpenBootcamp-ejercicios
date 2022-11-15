public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setNombre("Jose");
        persona1.setEdad(24);
        persona1.setTelefono("123-456789");

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private String telefono;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }
}