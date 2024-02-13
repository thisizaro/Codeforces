import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a % 2 == 0  && a / 2 != b) {
                System.out.println("Yes");
            } 
            else if(b % 2 == 0 && b / 2 != a)
            {
                System.out.println("Yes");
            }
            
            else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}