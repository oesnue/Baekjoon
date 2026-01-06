import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();
        int price;
        
        if (dice1 == dice2 || dice1 == dice3) {
            if (dice2 == dice3)
                price = 10000 + dice1 * 1000;
            else
                price = 1000 + dice1 * 100;
        }
        
        else if (dice2 == dice3)
            price = 1000 + dice2 * 100;
        
        else {
            int max = dice1;
            if (dice2 > max) max = dice2;
            if (dice3 > max) max = dice3;
            price = max * 100;
        }
        
        System.out.println(price);
    }
}