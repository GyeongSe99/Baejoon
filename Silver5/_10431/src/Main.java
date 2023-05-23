
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] testcase = new int[N][20];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 20; j++) {
                testcase[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] result = new int[N];
        for (int i = 0; i < result.length; i++) {
            for (int j = 1; j < 20; j++) {
                int target = testcase[i][j];
                int taller = -1;
                int minIdx = -1;
                int cnt = 0;
                for (int k = 0; k < j; k++) {
                    if (testcase[i][k] > target) {
                        taller = testcase[i][k];
                        minIdx = k;
                        break;
                    }
                }

                if (taller != -1) {
                    int temp = target;
                    for (int k = j; k > minIdx; k--) {
                        testcase[i][k] = testcase[i][k - 1];
                        cnt++;
                    }
                    testcase[i][minIdx] = temp;
                }
                result[i] += cnt;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(i + 1 + " " + result[i]);
        }
    }
}