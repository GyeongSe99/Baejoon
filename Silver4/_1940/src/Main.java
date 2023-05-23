import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] armors = new int[n];
        for (int i = 0; i < n; i++) {
            armors[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(armors);
        int left = 0;
        int right = armors.length - 1;
        int cnt = 0;
        while (left < right) {
            if (armors[left] + armors[right] == m) {
                cnt++;
                left++;
                right--;
            } else if (armors[left] + armors[right] < m) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(cnt);
        br.close();
    }
}