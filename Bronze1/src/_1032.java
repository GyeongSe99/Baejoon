// 명령 프롬프트
// 태그 : 구현, 문자열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] list = new String[n];

        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
        }

        String pre = list[0];
        boolean[] isDiffer = new boolean[pre.length()];   // pre.length = 10

        for (int i = 1; i < list.length; i++) {
            if (pre.equals(list[i])) {
                continue;
            } else {
                for (int j = 0; j < pre.length(); j++) {
                    if (pre.charAt(j) != list[i].charAt(j)) {
                        isDiffer[j] = true;
                    }
                }
            }
            pre = list[i];
        }

        for (int i = 0; i < pre.length(); i++) {
            char[] preChar = pre.toCharArray();
            if (isDiffer[i]) {
                preChar[i] = '?';
            }
            System.out.print(preChar[i]);
        }

    }
}
