import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        //합 배열 생성
        long[] S = new long[N];
        //나머지를 카운트하는 배열 생성
        long[] C = new long[M];
        long answer = 0;
        S[0] = sc.nextInt();
        //이전의 인덱스에 입력한 값을 더해서 배열에 값 대입. for문의 수행 길이가 같다고 해서 합치면 안된다.(이전의 인덱스를 사용하기 때문)
        for(int i = 1;i<N;i++)S[i]=S[i-1]+sc.nextInt();
        for(int i = 0;i<N;i++){
            //S배열( 합 배열 ) 의 모든 값들을 M과 나머지 연산.
            int remainder = (int) (S[i] % M);
            if(remainder==0)answer++;
            C[remainder]++;

        }
        for(int i=0;i<M;i++){
            if(C[i]>1)answer+=(C[i]*(C[i]-1)/2);
        }
        System.out.println(answer);

    }
}