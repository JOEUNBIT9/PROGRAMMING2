import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double a = 1500.35;
        double b = 890.76;

        int sum = (int)(a + b);
        double tax = sum *(10.0/100);
        int result = (int)(sum - tax) ;

        System.out.printf("이자1 = %.2f 원\n",a);
        System.out.printf("이자2 = %.2f 원\n",b);
        System.out.printf("합게:%,d원\n",sum);
        System.out.printf("세금 :%,.2f 원\n",tax);
        System.out.printf("순수이자:%,d 원\n",result);
    }
}