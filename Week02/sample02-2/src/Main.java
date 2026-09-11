import java.util.Arrays;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        System.out.print("당신의 이름은?"); //프롬프트(prompt) 문장
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는?",name); //프롬프트(prompt) 문장
        age = keyboard.nextInt();

        System.out.printf("이름 :%s,나이 :%d\n",name,age);
    }
}