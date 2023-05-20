import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String word = st.nextToken();
            StringBuffer sb = new StringBuffer();
            for (char c: word.toCharArray()) {
                for (int j = 1; j <= repeat; j++) {
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }
}