//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        boolean flag; //false;
        byte value1 = -128;    //-128 ~127
        short value2 = 32767; //-32789 ~ +32767
        int value3 = 4444444;
        long value4 = 444444444444444444L; //long형은 큰 갑을 표현할때 마지막에 L을
        double value5 = 4.5555555555555555555555555;
        float value6 = 4.55555555555555555555555555555f; //float 형은 큰 수를 표현할때 마지막에 f를
        char value7 = 'A'; //char는 따움표 안에 한글짜만,""(이중따움표)는 안됨
        String value8 ="AB"; // 공간이 6byte정도 잡힐듯
    }
}