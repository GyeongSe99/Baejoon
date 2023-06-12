import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[10001];
        for (int i = 0; i < N; i++) {
            list[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i] > 0) {
                while(list[i] > 0) {
                    bw.write(i + "\n");
                    list[i]--;
                }
            }
        }

        bw.flush();

    }
}