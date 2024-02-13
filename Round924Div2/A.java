import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String decodedWord = decodeWord(n);
            System.out.println(decodedWord);
        }
        scanner.close();
    }

    private static String decodeWord(int n) {
        StringBuilder decodedWord = new StringBuilder();
        int a = 1, b = 1, c = n - (a + b);

        if(c > 26)
        {
            b = b + (c - 26);
            c = 26;
        }

        if (b > 26)
        {
            a = a + (b - 26);
            b = 26;
        }


        decodedWord.append((char) ('a' + (a - 1)));
        decodedWord.append((char) ('a' + (b - 1)));
        decodedWord.append((char) ('a' + (c - 1)));
        return decodedWord.toString();
    }
}
