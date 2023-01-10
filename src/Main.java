public class Main {
    public static void main(String[] args) {
        int numeroIf = -1;

        if(numeroIf > 0){
            System.out.println("El número es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El número es 0");
        }else{
            System.out.println("El número es negativo");
        }

        // While

        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // do while

        do {
            System.out.println(numeroWhile);
        }while(numeroWhile < 3);

        // for

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        // Switch

        String estacion = "Primavera";

        switch (estacion){
            case "Primavera", "Verano", "Otoño", "Invierno":
                System.out.println("Estamos en la estacion " + estacion);
                break;
            default:
                System.out.println("No has puesto una estación");
                break;
        }
    }
}