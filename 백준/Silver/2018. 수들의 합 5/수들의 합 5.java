import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for(int start = 1, end = 1, sum = 1; end<n;){
            if(sum==n){
                count++;
                end++;
                sum+=end;
            }
            else if(sum>n){
                sum-=start;
                start++;
            }
            else{
                end++;
                sum+=end;
            }
        }
        System.out.println(count);
    }
}
