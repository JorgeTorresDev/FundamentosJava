package net.jurgenvinsmoke.practicas;

public class Main {
    public static void main (String [] args){

        final short enteroCorto = 32767;
        int enteroNormal = 3023;
        long enteroLargo;
        float decimalCorto = 24.45f;
        double decimalLargo = 23.353534543;
        char caracter = 'a';
        boolean esValido = true;

        enteroLargo = 54654654654l;
        enteroNormal = 43 + 7;
        int enteroNormal1 = 50 % 12;
        System.out.println ("EL modulo es: " + enteroNormal1);
        System.out.println (enteroLargo);
        System.out.println (enteroCorto);
        System.out.println (enteroNormal);
        System.out.println (decimalCorto);
        System.out.println(decimalLargo);
        System.out.println(caracter);
        System.out.println(esValido);

        nuevoTema("ARREGLOS: ");
        String [] nombres = new String[] {"JORGE","PEPE","ROGELIO"};

        System.out.println();
        System.out.println("Arreglos: ");
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);


        //System.out.println();
        //System.out.println("Ciclos y condiciones");
        nuevoTema("CICLOS Y CONDICIONES: ");
        if (enteroLargo > 1000){
            System.out.println("ES mayor");
        }else if (enteroLargo == 500){
            System.out.println("Es igual");
        }else {
            System.out.println("es menor");
        }

        //VALOR TERNEARIO
        System.out.println(enteroLargo > 1000? "Es mayor" : "es menor");

        System.out.println();
        //CICLO FOR
        for (int i = 0; i<3; i++)
        {

            System.out.println("Posicion: " + i);
        }
        System.out.println();

        for (String nombre: nombres){

            System.out.println(nombre);
        }

        //System.out.println();
        //System.out.println("SWITCH: ");
        nuevoTema("SWITCH: ");
        int index = (int)(Math.random() * 3);
        String nombreAleatorio = index < 4? nombres [index] : "Anonimo";
        System.out.println("El valor de index: " + index);
        switch (nombreAleatorio){
            case "Alain":
                System.out.println("Soy yo");
                break;
            case "Mary":
            case "Ricardo":
            case "Claudia":
                System.out.println("Es  " + nombreAleatorio);
                break;

                default:
                    System.out.println("Esta persona no existe en nuestro listado");


        }

    }

    private static void nuevoTema (String title ){

        System.out.println("\n=======" + title + ":");
    }

}
