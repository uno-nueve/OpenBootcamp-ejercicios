public class Main {
    public static void main(String[] args) {
        var numeroIf = -15;

        if (numeroIf > 0) {
            System.out.println("positivo");
        } else if (numeroIf < 0) {
            System.out.println("negativo");
        } else {
            System.out.println(0);
        }

        var numeroWhile = -2;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +5;
        } while (numeroWhile < 3);

        for (var numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "OTOÑO";
        switch (estacion) {
            case "VERANO":
                System.out.println("Es verano :D");
            break;
            case "OTOÑO":
                System.out.println("Es otoño :>");
            break;
            case "INVIERNO":
                System.out.println("Es invierno :S");
            break;
            case "PRIMAVERA":
                System.out.println("Es perimavera :)");
            break;
            default:
                System.out.println("No es una estación :(");
        }
    }
}