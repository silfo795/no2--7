import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k;
        String str = "";
        if (n < 0)
            n = 256 + n;
        while (n > 0) {
            str = n % 2 + str;
            n /= 2;
        }
        k=8-str.length();
        for(int i=1;i<=k;i++)
            str=0+str;
        System.out.println(str);
    }
}
