import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    static int[] result;
    static boolean[] existed;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new int[M + 1];
        existed = new boolean[N + 1];

        dfs(1);
        System.out.println(sb.toString());

    }

    static void dfs(int k) {
        if (k == M + 1) {
            // 결과 sb에 넣기
            for (int i = 1; i <= M; i++) {
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
        } else {
            for (int i = 1; i <= N; i++) {
                if (existed[i] == false) {
                    result[k] = i;
                    existed[i] = true;
                    dfs(k + 1);
                    result[k] = 0;
                    existed[i] = false;
                }
            }
        }
    }
}