package net.jurgenvinsmoke.practicas;

public class POO {
    public static void main(String[] args) {
        Casa miCasa = new Casa( "Independencia", 'd',(short)34, 2000000,  1104537600000L,
                 3.5f,  320.3453454543543,  false);

        System.out.println(miCasa);

        Casa maryCasa = new Casa ( "Reforma",(short)34, 3500000,  true);

        Casa claudiaCasa = new Casa ("Roma",  (short)12, 12000000,  false);

        System.out.println(maryCasa);

        System.out.println(claudiaCasa);

    }
}