import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            // System.out.println("Check: 2");
            Boolean k = check(n, scanner);
            if(k)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            
            }
        }
        scanner.close();
    }

    private static Boolean check(int n, Scanner sc) {
        
        int a[] = new int[n];
        int avg = 0;

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
            avg = avg + a[i];
        }
        avg = avg / n;
        
        int ex = 0;
        for(int i = 0; i < n; i++)
        {
            // System.out.println("Check: 1");
            a[i] = a[i] + ex;
            if(a[i] < avg)
            {
                return false;
            }
            else
            {
                ex = a[i] - avg;
            }
        }
        return true;
    }
}
