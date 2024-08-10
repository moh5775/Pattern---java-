
import java.util.Scanner;

public class TriRev4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, j;
        System.out.print("n: ");
        n = input.nextInt();
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            int x = i;
            for (j = i; j <= n; j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
