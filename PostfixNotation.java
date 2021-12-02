import java.util.Scanner;
import java.util.Stack;

public class PostfixNotation {
    public static void main(String[] args) {
        Scanner inputStream = new Scanner(System.in);
        int quantity = inputStream.nextInt();
        int number = 0;
        Stack<Integer> operands = new Stack();

        for (int i = 0; i < quantity; ++i) {
            number = inputStream.nextInt();

            if (number >= 0) {
                operands.push(number);
            } else {
                int a = operands.pop();
                int b = operands.pop();

                switch (number) {
                    case -1:
                        b *= a;
                        break;
                    case -2:
                        b += a;
                        break;
                    case -3:
                        b -= a;
                        break;
                }

                operands.push(b);
            }

        }

        System.out.print(operands.peek());
    }
}
