import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPossible = false;

        int N = sc.nextInt();
        sc.nextLine();
        int[] array = new int[N];

        String[] nums = sc.nextLine().split(" ");

        for (int i = 0; i < nums.length; i++) {
            array[i] = Integer.parseInt(nums[i]);
        }

        Stack<Integer>[] stacks = new Stack[4];
        for (int i = 0; i < 4; i++) {
            stacks[i] = new Stack<>();
            stacks[i].push(0);
        }

        for (int num : array) {
            for (Stack<Integer> stack : stacks) {
                if (num > stack.peek()) {
                    stack.push(num);
                    isPossible = true;
                    break;
                } else {
                    isPossible = false;
                }
            }

            if (isPossible == false) {
                System.out.println("NO");
                break;
            }
        }

        if (isPossible == true) {
            System.out.println("YES");
        }
    }
}