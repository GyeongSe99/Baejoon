import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 9;
        int[] list = new int[9];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int maxIdx = 0;

        for (int i = 0; i < N; i++) {
            if (list[i] > max) {
                max = list[i];
                maxIdx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(maxIdx);
    }
}