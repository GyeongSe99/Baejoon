// 17298
// 오큰수

// 스택에 새로 들어오는 수가 top에 존재하는 수보다 크면 그 수는 오큰수가 된다.
// 오큰수를 구한 후 수열에서 오큰수가 존재하지 않는 숫자에 -1 출력

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        int[] answer = new int[n];
        String[] str = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0);  // 일단 첫번째 인덱스는 무조건 푸쉬하기
        for (int i = 1; i < n; i++) {
            // 스택이 비어있지 않고 다음 올 수가 스택에서 peek한 수보다 클 경우
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                answer[stack.pop()] = arr[i];   // 정답 배열에 넣기
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            answer[stack.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}