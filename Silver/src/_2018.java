import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        int left = 0;
        int right = 1;
        int sum = nums[0];
        int cnt = 0;

        while (right <= nums.length && left < nums.length) {
            if (sum < N) {
                sum += nums[right];
                right++;
            } else if (sum == N){
                cnt++;
                sum -= nums[left];
                left++;
            } else {
                sum -= nums[left];
                left++;
            }
        }

        System.out.println(cnt);
    }
}
