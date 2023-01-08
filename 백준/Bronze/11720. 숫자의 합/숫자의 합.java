import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner 클래스를 사용해서 콘솔에서 입력받을 Scanner클래스의 인스턴스 객체를 만든다.
        Scanner sc = new Scanner(System.in);
        //int N을 콘솔에서 입력받는다.
        int N = sc.nextInt();
        //String sNum을 콘솔에서 입력받는다.
        String sNum = sc.next();
        //toCharArray 메소드를 사용해서 String인 sNum을 char 배열로 변환하였다.
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        //sum은 int값. c와 '0'은 char이고 아스키코드값으로 빼기 연산이 되어 결과적으로 원하는 숫자 int값이 연산이 된다.
        for(char c : cNum)sum+=c-'0';
        //출력
        System.out.println(sum);
    }
}
