public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setEdad(27);
        cliente.setNombre("Carmen Miranda");
        cliente.setTelefono(1234567890);
        cliente.setCredito(599.99);

        System.out.println("Nombre del cliente: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad() + " años");
        System.out.println("Teléfono de contacto: " + cliente.getTelefono());
        System.out.println("Deuda tarjeta de crédito: €" + cliente.getCredito());


        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(35);
        trabajador.setNombre("Mario Lopez");
        trabajador.setTelefono(1237654890);
        trabajador.setSalario(2105.85);

        System.out.println("Nombre del trabajador: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Teléfono de contacto: " + trabajador.getTelefono());
        System.out.println("Salario mensual: €" + trabajador.getSalario());
    }

}

abstract class Persona {
     int edad;
     String nombre;
     int telefono;

     abstract public void setEdad(int edad);
     abstract public void setNombre(String nombre);
     abstract public void setTelefono(int telefono);

     abstract public int getEdad();
     abstract public String getNombre();
     abstract public int getTelefono();
}
class Cliente extends Persona{
    public double credito;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public  void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }

    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
    public double getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona{
    public double salario;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public  void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
    public double getSalario() {
        return this.salario;
    }
}