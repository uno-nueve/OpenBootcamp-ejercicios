public class Main {

    public static void main(String[] args){
        Coche miCoche = new Coche();
        miCoche.SumarPuertas();

        System.out.println(miCoche.puertas);
    }
}

class Coche {
    int puertas = 5;

    void SumarPuertas(){
        this.puertas++;
    }
}