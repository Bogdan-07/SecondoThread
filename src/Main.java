import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int lentezza;


        System.out.println("Inserisci la lentezza del cavallo");
        lentezza = scanner.nextInt();
        Cavallo fulmine = new Cavallo("Fulmine", lentezza);
        System.out.println("Inserisci la lentezza del cavallo");
        lentezza = scanner.nextInt();
        Cavallo lampo = new Cavallo("Lampo",lentezza);
        System.out.println("Inserisci la lentezza del cavallo");
        lentezza = scanner.nextInt();
        Cavallo rose = new Cavallo("Rose",lentezza);
        System.out.println("Inserisci la lentezza del cavallo");
        lentezza = scanner.nextInt();
        Cavallo davino = new Cavallo("Davino",lentezza);
        System.out.println("Inserisci la lentezza del cavallo");
        lentezza = scanner.nextInt();
        Cavallo rondo = new Cavallo("Rondo",lentezza);

        fulmine.start();
        lampo.start();
        rose.start();
        davino.start();
        rondo.start();

    }
}