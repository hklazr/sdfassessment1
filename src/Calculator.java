package task02.src;

import java.util.Scanner;

public class Calculator {

    private static double result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, add, subtract, multiply, divide;
        char operation;
        System.out.println("Welcome.");

        while (true) {
            
            n1 = sc.nextDouble();
            operation = sc.next().charAt(0);
            n2 = sc.nextDouble();

            switch (operation) {
            case '+':
                add = n1 + n2;
                System.out.println(add);
                break;

            case '-':
                subtract = n1 - n2;
                System.out.println(subtract);
                break;
            case '*':
                multiply = n1 * n2;
                System.out.println(multiply);
                break;
            case '/':
                divide = n1 / n2;
                System.out.println(divide);
                break;

            
            }
        }
    }
}

      
    

