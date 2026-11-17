package q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pozitif bir tamsayı girin: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();
        int divisor = 2;

        while (number > 1) {
            while (number % divisor == 0) {
                stack.push(divisor);
                number /= divisor;
            }
            divisor++;
        }

        System.out.print("Asal çarpanlar (ters sırada): ");
        while (!stack.empty()) {
            System.out.print(stack.pop());
            if (!stack.empty()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

