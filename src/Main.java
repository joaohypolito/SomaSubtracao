public class Main {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;
        int subtraction = number1 - number2;

        System.out.println("A soma de " + number1 + " + " + number2 + " é igual a " + (number1 + number2));
        System.out.println(String.format("A subtração de %d - %d é igual a %d", number1, number2, subtraction));
    }
}