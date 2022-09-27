import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Das ist voll fancy";

        System.out.println("This ist now Version 3");
        System.out.println("Dennis war hier");
        System.out.println("Steven has been here ;-)");

        System.out.println("The Sum is: " + addition(9, 8));
        System.out.println(addString(3, 4));

        if(name.length() < 10){
            System.out.println("Es sind weniger als 10 Zeichen");
        }else {
            System.out.println("Es sind mehr als 10 Zeichen");
        }

        System.out.println(name.contains("fancy"));
        System.out.println(name.replaceAll("voll", "ultra"));

        anzahl(30);
        anzahl(31);
        anzahl(15);

    }

    public static int addition(int number1, int number2){
        return  number1 + number2;
    }

    public static String addString(int number3, int number4) {
        return "Die Summe ist: " + (number3 + number4);
    }

    public static void anzahl(int anzahlLeute) {
         if(anzahlLeute > 30) {
            System.out.println("Zu viele Personen!");
        } else if(anzahlLeute == 30) {
            System.out.println("Maximale Anzahl erreicht");
        }else {
            System.out.println("Maximale Personenanzahl nicht erreicht");
        }
    }
}