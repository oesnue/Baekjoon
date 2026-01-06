import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        long x = Long.parseLong(a);
        long y = Long.parseLong(b);
        long z = Long.parseLong(c);
        
        System.out.print(x + y + z);
    }
}