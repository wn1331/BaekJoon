import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 1;
        int[] arr = new int[N];
        for(int i = 0; i<N;i++) arr[i] = sc.nextInt();
        boolean result = true;
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();//출력 결과를 만들기 위한 sb.
        for(int i = 0; i < N; i++ ){
            if(arr[i]>=num){
                while(arr[i]>=num){
                    stack.push(num++);
                    //이스케이프 시퀀스를 포함한 문자(+나 -)를 stringbuilder에 추가해준다.
                    sb.append("+\n");
                }
                //가장 위 숫자보다 큰 것은 모두 push.
                stack.pop();
                sb.append("-\n");
            }
            else{
                int n = stack.pop();
                if(n>arr[i]){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else{
                    sb.append("-\n");
                }
            }
        }
        if(result) System.out.println(sb.toString());
    }

}