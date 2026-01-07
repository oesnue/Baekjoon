import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total_price = scanner.nextInt();
        int size = scanner.nextInt();
        int sum = 0;
        
        for(int i = 0; i < size; i++) {
            int price = scanner.nextInt();
            int inventory = scanner.nextInt();
            sum += price * inventory;
        }
        
        if(total_price == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}