//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        char a ='A'; //char도 int로 변함
        int result = (char)a+1; //회색으로 뜨는건 의미(필요)가 없다

        System.out.printf("a = %c(%d),result=%c(%d)\n",a,(int)a,result,result);
    }
}