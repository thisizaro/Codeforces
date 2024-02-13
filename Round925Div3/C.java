import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            // System.out.println("Check: 2");
            check(n, scanner);
        }
        scanner.close();
    }

    private static void check(int n, Scanner sc) {
        
        int a[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        
        int c = -1;
        for(int i = 0, j = n - 1; i < j;)
        {
            c = c * -1;
            if(a[i] != a[j])
            {
                // System.out.print("Answer: ");
                if(a[i] != a[i + 1] && a[j] != a[j - 1])
                {
                    System.out.println(j - i);
                    return;
                }
                else if(a[i] == a[i + 1])
                {
                    i++;
                }
                else
                {
                    j--;
                }
            }
            else if(c < 0)
            {
                i++;
            }
            else 
            {
                j--;
            }
        }
        // System.out.print("Answer: ");
        System.out.println(0);
    }
}
