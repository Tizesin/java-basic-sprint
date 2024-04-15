public class Solution_0403 {

    public static void main(String[] args) {
        double pi;
        int num, num1, num2, result;
        //문제 1 : char을 사용하여 변수 course를 선언
        char course;
        //문제 2 : course에 char type 'A' 할당
        course = 'A';

        //문제 3 : num에 정수 100을 할당
        num = 100;

        //문제 4 : pi에 실수 3.14 할당
        pi = 3.14;

        //문제 5 : num1,2에 5, 7할당 후 result에 두 값 곱 할당
        num1 = 5; num2 = 7; result = num1 * num2;
    }
    //문제 6 : 거리를 속력과 시간을 통해 구하는 메서드 작성
    public int getRunCatDistance(int speed, int time){
        int distance = speed * time;
        return distance;
    }

    //문제 7 : 첫번째 인자를 2로 나누는 메서드 선언
    public int deviceBy(int input){
        input /= 2;
        return input;
    }

    //문제 8 : 메서드호출/리턴문제
    public String invoke() {
        String word = "anything";
        word = returnWordWithJoy(word);
        return word;
    }
    public static String returnWordWithJoy(String str){
        if(str.equals("")) return "empty value";
        else return str + "!";
    }

    //문제 9 :
    public String type(){
        int num = 3;
        char thing = 'A';

        return goCheck(num,thing);
    }

    public String goCheck(int num, char thing) {
        return String.format("%c가 %d개?",thing, num);
    }

    //문제 10 : score에 숫자 100이 할당되도록 하기.
    public int plusRightType(){
        int score = 99 + 1;
        return score;
    }

    //문제 11 : char형을 int형으로 형변환
    public int converToNumber(char character){
        int result;
        result = Character.getNumericValue(character);
        //result = (int)character;
        return result;
    }

}
