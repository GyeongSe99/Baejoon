import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int cnt = 0;
        while (queue.size() != 1) {
            int temp = queue.poll();
            cnt++;
            if ( cnt % 2 == 0) {
                queue.add(temp);
            } else {
                System.out.print(temp + " ");
            }
        }
        System.out.println(queue.peek());
    }
}