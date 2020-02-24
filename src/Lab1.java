import java.util.Scanner;
import java.util.Stack;

public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] mas;
        System.out.print("Введите последовательность скобок \n");
        String c = in.nextLine();
        mas = c.toCharArray();

        Stack<Character> stack = new Stack<>();
        for (char p : mas) {
            if (p == '(' || p == '[' || p == '{') {
                stack.push(p);
            }
            if (!stack.empty()) {
                char s = stack.peek();
                if (s == '[' && p == ']' || s == '{' && p == '}' || s == '(' && p == ')') {
                    stack.pop();
                }
            }
        }
        if (stack.empty())
            System.out.println("Последовательность верна");
        else System.out.println("Последовательность неверна");
    }
}