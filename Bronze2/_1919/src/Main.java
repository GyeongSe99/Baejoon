import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int[] countA = new int[26];
        int[] countB = new int[26];
        for (int i = 0; i < A.length(); i++) {
            countA[A.charAt(i) - 'a']++;
        }
        for (int i = 0; i < B.length(); i++) {
            countB[B.charAt(i) - 'a']++;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            cnt += Math.abs(countA[i] - countB[i]);
        }
        System.out.println(cnt);
    }
}