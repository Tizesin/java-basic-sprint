import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //psvm입력 시 자동으로 public static void main 문이 생성.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            try {
                Exception e = new Exception("이름입력 오류");
                System.out.print("이름을 입력하세요 : ");
                String user_name = scan.nextLine();
                if (!check_Ex(user_name))
                    throw e;
                System.out.print("나이를 입력하세요 : ");
                int user_age = scan.nextInt();
                if(user_age == 0)
                    throw e;
                System.out.println("이름 : " + user_name + " | 나이 : " + user_age);
                break;
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
    public static boolean check_Ex(String user_name){
        String Up_user_name = user_name.toUpperCase();
        for(int i = 0;i<user_name.length();i++)
        {
            if((Up_user_name.charAt(i) >= 0x40 && Up_user_name.charAt(i) <= 0x5A) || Up_user_name.charAt(i) == 0x20
                    || (Up_user_name.charAt(i) >= 44032 && Up_user_name.charAt(i) <= 55203))
                continue;
            else
                return false;
        }
        return true;
    }
}