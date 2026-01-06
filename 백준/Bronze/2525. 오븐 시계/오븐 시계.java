import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int time = scanner.nextInt();
        
        if (time < 60 - minute)
            minute += time;
        
        else {
            int h = time / 60;
            int m = time % 60;
            hour += h;
            
            if (minute + m >= 60) {
                hour += 1;
                minute = 0 + (minute + m - 60); 
            }
            
            else {
                minute += m;
            }
        }
        
        if (hour >= 24)
            hour = 0 + (hour % 24);
        
        System.out.printf("%d %d", hour, minute);
    }
}