/*
- Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5.
    Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".
- Crie uma classe Subtração para imprimir o resultado de 10 - 5 no console.
 */

public class Main {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;
        int subtraction = number1 - number2;

        System.out.println("A soma de " + number1 + " + " + number2 + " é igual a " + (number1 + number2));
        System.out.println(String.format("A subtração de %d - %d é igual a %d", number1, number2, subtraction));
    }
}