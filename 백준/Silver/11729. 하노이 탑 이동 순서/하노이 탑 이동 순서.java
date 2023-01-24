import java.io.*;

public class Main {
    //bw는 재귀함수에서도 접근이 가능해야 하므로 전역변수로 선언해야 한다.
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //원판의 개수 입력
        int n = Integer.parseInt(br.readLine());
        //원판의 이동 횟수 미리 출력. 하노이 탑 갯수 공식이 있음.
        bw.write((int)(Math.pow(2,n)-1)+"\n");
        hanoi(n,1,2,3);

        bw.flush();
        bw.close();
    }
    //매개변수들과 매개변수 순서가 헷갈릴 수 있다.
    //매개변수의 뜻은 이름 그대로이다.
    //hanoi(옮기고싶은거, 남는기둥, 옮길곳)
    //start = 1번째기둥, temp = 2번째 기둥, to = 3번째 기둥
    static void hanoi(int n, int start, int temp, int to) throws IOException {
        //원판이 한 개만 남았을 때.(재귀종료)
        if(n==1){
            bw.write(start+" "+to+"\n");
            return;
        }
        //n-1개의 원판을 2번째 기둥으로 이동.
        hanoi(n-1,start,to,temp);
        //예를 들어, 총 3개의 원판을 하노이탑 공식을 한다 하면 start의 3개의 원판중 맨 아래의 한개 원판을 제외한 2개의 원판을 가운데 기둥으로 옮긴 후(위 코드)
        //가장 아래에 있는 원판을 3번째 기둥으로 옮겨야 한다. 그 코드가 아래의 코드
        bw.write(start+" "+to+"\n");
        //n-1개의 원판을 temp 즉 2번째 기둥으로 놓았었다면 그것들을 다시 to로(3번째 기둥으로) 이동해야 한다.
        hanoi(n-1,temp,start,to);
    }


}