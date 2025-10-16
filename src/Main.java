import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la distanza che devono percorrere i cavalli: ");
        int distanza = scanner.nextInt();

        Cavallo fulmine = new Cavallo("Fulmine", distanza);
        Cavallo lampo = new Cavallo("Lampo", distanza);
        Cavallo rose = new Cavallo("Rose", distanza);
        Cavallo davino = new Cavallo("Davino", distanza);
        Cavallo rondo = new Cavallo("Rondo", distanza);

        fulmine.start();
        lampo.start();
        rose.start();
        davino.start();
        rondo.start();

    }
}