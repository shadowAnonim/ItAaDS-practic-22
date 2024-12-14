import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<Double> operants = new Stack<>();
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(sc.nextLine());
        System.out.println("Введите выражение в обратной польской нотации");
        double result;
        while (sc.hasNext())
        {
            if (sc.hasNextDouble())
                operants.push(sc.nextDouble());
            else {
                String operator = sc.next();
                double second = operants.pop();
                double first = operants.pop();
                switch (operator)
                {
                    case "+":
                        result = operants.push(first + second);
                        break;
                    case "-":
                        result = operants.push(first - second);
                        break;
                    case "*":
                        result = operants.push(first * second);
                        break;
                    case "/":
                        result = operants.push(first / second);
                        break;
                    default:
                        throw new IllegalArgumentException(operator + " не является арифметической операцией");
                }
            }
        }
        System.out.println(operants.pop());
        main(args);
    }
}