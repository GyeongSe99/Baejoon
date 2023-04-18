// 요세푸스 순열 문제

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }

        int cnt = 0;
        while (!queue.isEmpty()) {
            int data = queue.poll();
            cnt++;

            if (cnt % K == 0) {
                result.add(data);
            } else {
                queue.add(data);
            }
        }

        System.out.print("<");
        for (int i = 0; i < result.size() - 1; i++) {
            System.out.print(result.get(i) + ", ");
        }
        System.out.print(result.get(result.size() - 1) + ">");

    }
}