import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        //오큰수 구하기
        //스택에 들어오는 수가 top보다 크면 그 수가 오큰수
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] answer = new int[n];
        for(int i = 0; i<n;i++)arr[i] = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int i = 1; i<n; i++){
            while(!stack.isEmpty()&&arr[stack.peek()]<arr[i]){
                answer[stack.pop()] = arr[i];//정답 배열에 오큰수를 현재 배열을 저장
            }
            stack.push(i);
        }
        while(!stack.empty()) answer[stack.pop()]=-1;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i<n;i++)bw.write(answer[i]+ " ");
        bw.write("\n");
        bw.flush();
    }

}