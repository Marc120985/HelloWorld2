public class Main {
    public static void main(String[] args) {
        System.out.println("This ist now Version 3");
        System.out.println("Dennis war hier");
        System.out.println("Steven has been here ;-)");

        System.out.println("The Sum is: " + addition(9, 8));
        System.out.println(addString(3, 4));
    }

    public static int addition(int number1, int number2){
        return  number1 + number2;
    }

    public static String addString(int number3, int number4) {
        return "Summe: " + (number3 + number4);
    }
}