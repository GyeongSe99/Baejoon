import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int col = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());

        boolean[] cols = new boolean[col];
        boolean[] rows = new boolean[row];
        String[] castle = new String[col];

        for (int i = 0; i < col; i++) {
            castle[i] = br.readLine();
        }
        for (int i = 0; i < col; i++) {
            String temp = castle[i];
            char[] line = temp.toCharArray();
            for (int j = 0; j < line.length; j++) {
                if (line[j] == 'X') {
                    cols[i] = true;
                    rows[j] = true;
                }
            }
        }

        int yCnt = 0;
        for (int i = 0; i < col; i++) {
            if (cols[i] == false) {
                yCnt++;
            }
        }

        int xCnt = 0;
        for (int i = 0; i < row; i++) {
            if (rows[i] == false) {
                xCnt++;
            }
        }

        System.out.println(Math.max(yCnt, xCnt));
    }
}