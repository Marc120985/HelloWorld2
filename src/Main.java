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

        anzahl(91);
        anzahl(30);
        anzahl(15);

        anzahlSwitch(30);
        anzahlSwitch(32);



    }

    public static int addition(int number1, int number2){
        return  number1 + number2;
    }

    public static String addString(int number3, int number4) {
        return "Die Summe ist: " + (number3 + number4);
    }

    public static void anzahl(int anzahlLeute) {
        System.out.println("Personenanzahl: " + anzahlLeute);
        System.out.println("Max sind 90 Personen erlaubt");
         if(anzahlLeute > 90) {
            alarmstufe("rot");
        } else if(anzahlLeute >= 30) {
            alarmstufe("gelb");
             System.out.println("Es sind noch " + (90-anzahlLeute) + " erlaubt");
        }else {
            alarmstufe("grün");
             System.out.println("Es sind noch " + (90-anzahlLeute) + " erlaubt");
        }
    }

     public static void anzahlSwitch(int anzahlLeute) {
        switch (anzahlLeute) {
            case 30:
                System.out.println("Maximale Zahl erreicht");
                break;
            case 31:
                System.out.println("Zu viele Personen");
                break;
            default:
                System.out.println("Switch macht keinen Sinn");
        }
    }

    public static void alarmstufe(String farbe){
        switch (farbe) {
            case "rot":
                System.out.println("Alarmstufe ROT!");
                break;
            case "gelb":
                System.out.println("Alarmstufe GELB!");
                break;
            case "grün":
                System.out.println("Alarmstufe GRÜN!");
                break;
            default:
                break;

        }
    }
}