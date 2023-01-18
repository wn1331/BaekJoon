import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        //좋은 수 구하기
        //주어진 N개의 수에서 다른 두 수의 합으로 표현되는 수가 있다면 그 수를 '좋은 수'라고 한다. N개의 수 중 좋은 수가 총 몇개인지 출력하시오.
        int answer = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        Long[] arr = new Long[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i<N;i++) arr[i] = Long.parseLong(st.nextToken());
        Arrays.sort(arr);
        for(int k = 0;k<N;k++){
            long This = arr[k];
            int left = 0;
            int right = N-1;
            while(left<right){
                if(arr[left]+arr[right]==This){
                    if(left!=k&&right!=k){
                        answer++;
                        break;
                    }
                    else if(left==k)left++;
                    else if(right==k)right--;
                }
                else if (arr[left]+arr[right]<This) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        System.out.println(answer);
    }

}