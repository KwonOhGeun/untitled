import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //학점계산기
        int a;
        System.out.printf("점수를 입력하세요 : ");
        a = s.nextInt();

        if ( a >= 90) {
            System.out.println("A학점입니다");
        } else if ( a >= 80 ){
            System.out.println("B학점입니다.");
        }
        else if ( a >= 70 ) {
            System.out.println("C학점입니다.");
        } else if ( a >= 60 ) {
            System.out.println("D학점입니다.");
        }
        else {
            System.out.println("F학점입니다.");
        }
    }
}
