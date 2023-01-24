import java.io.*;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //맨 첫줄 읽어오기.
        int n = Integer.parseInt(br.readLine());

        //PriorityQueue를 사용하기 위해선 우선순위 큐에 저장할 객체는 아래처럼 필수적으로 Comparable Interface를 구현해야한다.
        //매개로 o1과 o2가 들어왔을 때, 두 절대값을 비교하고, 절대값이 같다면 원본 값중 큰 것은 1
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            //여기서 우선순위 큐의 구조를 return값으로 지정해 주었다.
            if(abs1 == abs2) return o1 > o2 ? 1 : -1;
            //리턴값
            //양수 : 첫번째 매개변수가 더 큰 값으로 판단
            //0 : 같은 값으로 판단
            //음수 : 첫번째 매개변수가 더 작은 값으로 판단
            return abs1 - abs2;
        });

        for(int i = 0 ; i < n; i++){
            //큐에 넣을 값을 입력받는다. 0일때는 따로 동작하도록 구현.
            int val = Integer.parseInt(br.readLine());
            if(val == 0){
                if(queue.isEmpty()) System.out.println("0");
                // priorityQueue에 첫번째 값을 반환하고 제거한다. 비어있다면 null인데 위 코드에서 이미 비어있을때의 예외처리를 했다.
                else System.out.println(queue.poll());
            }else{
                // priorityQueue에 값을 추가한다.
                queue.add(val);
            }
        }

    }




}