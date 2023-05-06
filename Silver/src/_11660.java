import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] initial = new int[N + 1][N + 1];
        int[][] sumTable = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                initial[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 초기배열 출력
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(initial[i][j] + " ");
            }
            System.out.println();
        }

        // 합 배열 만들기
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                sumTable[i][j] = sumTable[i - 1][j] + sumTable[i][j - 1] - sumTable[i - 1][j - 1] + initial[i][j];
            }
        }

        // 합배열 출력
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(sumTable[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) - 1;
            int x2 = Integer.parseInt(st.nextToken()) - 1;
            int y1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(sumTable[y1][y2] - sumTable[x1][y2] - sumTable[y1][x2] + sumTable[x1][x2]);
        }
    }
}
