import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int time = 0;
        while (n != k) {
            int distance = Math.abs(k - n);
            int jumpDis = Math.abs(k - 2*n);
            if (n > k) {    // 더 앞에있다면 뒤로 가야함
                n--;
                time++;
            } else {    // 더 뒤에있다면 앞으로 가야함
                if (distance <= jumpDis) {
                    n = Math.abs(k - n + 1) < Math.abs(k - n - 1) ? n + 1 : n - 1;
                    time++;
                } else {    //순간이동한게 더 가까울 때
                    n = 2*n;
                    time++;
                }
            }
        }
    }

}
