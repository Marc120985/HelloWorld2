import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Das ist voll fancy!";
        System.out.println(name);

        nameLenght(name);

        System.out.println("The Sum is: " + addition(9, 8));
        System.out.println(addString(3, 4));

        System.out.println(name.contains("fancy"));
        System.out.println(name.replaceAll("voll", "ultra"));

        anzahl(91);
        anzahl(30);
        anzahl(15);

  //      anzahlSwitch(30);
  //      anzahlSwitch(32);

  //      versuchScanner();


        System.out.println("Ab hier soll der Taschenrechner laufen");
        taschenrechner();


    }

    public static void nameLenght(String name){
        if(name.length() < 10){
            System.out.println("Es sind weniger als 10 Zeichen");
        }else {
            System.out.println("Es sind mehr als 10 Zeichen");
        }
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
        int rechner = 90 - anzahlLeute;
         if(anzahlLeute > 90) {
            alarmstufe("rot");
        } else if(anzahlLeute >= 30) {
            alarmstufe("gelb");
             System.out.println("Es sind noch " + rechner + " erlaubt");
        }else {
            alarmstufe("grün");
             System.out.println("Es sind noch " + rechner + " erlaubt");
        }
    }

/*     public static void anzahlSwitch(int anzahlLeute) {
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
*/
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

    public static void versuchScanner(){
        Scanner scannerVersuch = new Scanner(System.in);
        System.out.println("Please type a Text and press Enter");
        String textInput = scannerVersuch.nextLine();
        System.out.println("Your Text is: " + textInput);
    }

    public static void taschenrechner(){
        Scanner rechner = new Scanner(System.in);
        System.out.println("Bitte geb die erste Zahl ein:");
        double number1 = rechner.nextDouble();
        rechner.nextLine();
        System.out.println("Bitte gebe deine Rechenoption ein: (+, -, *, /)");
        String operand = rechner.nextLine();
        System.out.println("Bitte gebe deine zweite Zahl ein: ");
        double number2 = rechner.nextDouble();
        rechner.nextLine();

        if(operand.equals("+")){
            double result = number1 + number2;
            System.out.println("Dein Ergebnis ist: " + result);
        }else if(operand.equals("-")){
            double result = number1 - number2;
        }else if(operand.equals("*")){
            double result = number1 * number2;
        }else if(operand.equals("/")){
            double result = number1 / number2;
        }else {
            System.out.println("Die Eingabe war nicht korrekt");
        }
    }
}