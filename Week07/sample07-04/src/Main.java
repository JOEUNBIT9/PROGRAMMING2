import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int salary;
        int tax;
        String result;
        final int MIN = 20000000;
        final int MAX = 300000000;


        System.out.print("당심의 급여 입력:");
        salary = keyboard.nextInt();

        if (salary >= 0 && salary <= MAX) {
            if (salary <= MIN) {
                tax = 0;
            } else if (salary <= 4000000) {
                tax = (int) ((salary - MIN) * (10.0f / 100));
            } else if (salary <= 6000000) {
                tax = (int) ((salary - MIN) * (8.0f / 100));
            } else if (salary <= 20000000) {
                tax = (int) ((salary - MIN) * (6.0f / 100));
            } else {
                tax = (int) ((salary - MIN) * (5.0f / 100));
            }
            result = String.format("급여액이 %,d원이면 %,d원의 세금을 납부하세요.\n", salary, tax);
        } else {
            result = String.format("Error : 급여액은 ~ %,d원 입니다 ");
        }

        System.out.println(result);
    }
}
