import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] init = new long[N];

        // 초기 배열 세팅
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            init[i] = Integer.parseInt(st.nextToken());
        }

        // 합배열
        long[] sum = new long[N];
        sum[0] = init[0];
        for (int i = 1; i < N; i++) {
            sum[i] = sum[i - 1] + init[i];
        }

        // 나머지 카운트
        long[] remain = new long[M];
        long cnt = 0;
        for (int i = 0; i < N; i++) {
            int cur = (int) (sum[i] % M);
            remain[cur]++;
            if (cur % M == 0) {
                cnt++;
            }
        }

        for (int i = 0; i < M; i++) {
            if (remain[i] > 1) {
                cnt += (remain[i] * (remain[i] - 1)) / 2;
            }
        }

        System.out.println(cnt);
    }
}