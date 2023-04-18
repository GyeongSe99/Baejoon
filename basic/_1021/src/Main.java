// N개의 원소를 포함하고 있는 양방향 순환 큐
// 첫 번째 원소를 뽑아낸다. 이 연산을 수행하면, 원래 큐의 원소가 a1, ..., ak이었던 것이 a2, ..., ak와 같이 된다.
// 왼쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 a2, ..., ak, a1이 된다.
// 오른쪽으로 한 칸 이동시킨다. 이 연산을 수행하면, a1, ..., ak가 ak, a1, ..., ak-1이 된다.
// 원소를 주어진 순서대로 뽑아내는데 드는 2번, 3번 연산의 최솟값을 출력하는 프로그램을 작성하시오.
// 1번(뽑아내기는 cntX)

// 예제
// N(큐의 크기) M(뽑아내려고 하는 수의 개수) : 10 3
// 뽑아내려고 하는 수의 위치 : 1 2 3

// 10 3
// 2 9 5

// 32 6
// 27 16 30 11 6 23


import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        String[] str = sc.nextLine().split(" ");
        int[] target = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            target[i] = Integer.parseInt(str[i]);
        }   // 2 9 5

        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        Deque<Integer> dq = new LinkedList<>();
        IntStream.range(1, N + 1).forEach(x -> dq.add(x));

        int cnt = 0;

        for (int i = 0; i < target.length; i++) {
            int idx = 0;
            for (int j : dq) {
                if (j == target[i]) {
                    break;
                } else {
                    idx++;
                }
            }

            if (idx < dq.size() - idx) {
                while (dq.peekFirst() != target[i]) {
                    dq.offerLast(dq.pollFirst());
                    cnt++;
                }
                dq.pollFirst();
            } else {
                while (dq.peekFirst() != target[i]) {
                    dq.offerFirst(dq.pollLast());
                    cnt++;
                }
                dq.pollFirst();
            }
        }

        System.out.println(cnt);
    }
}