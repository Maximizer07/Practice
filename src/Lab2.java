import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите через пробел количество купюр различного номинала: 30, 100, 500, 1000 \n");
        int s1 = in.nextInt();
        int s2 = in.nextInt();
        int s3 = in.nextInt();
        int s4 = in.nextInt();
        System.out.print("Введите сумму, которую желаете получить \n");
        int N = in.nextInt();
        for (int w = 0; w < s1; w++) {
            for (int k = 0; k < s2; k++) {
                for (int j = 0; j <s3; j++) {
                    for (int i = 0; i < s4; i++) {
                        if (N == 1000 * i + 500 * j + 100 * k + 30 * w) {
                            System.out.println("Купюр номиналом 1000:\t" + i + "\nКупюр номиналом 500:\t" + j + "\nКупюр номиналом 100:\t" + k + "\nКупюр номиналом 30:\t\t" + w);
                            return;
                        }
                    }
                }
            }
        }
        System.out.print("Невозможно выдать сумму");
    }
}