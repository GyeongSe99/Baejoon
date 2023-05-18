import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        char[] word = sc.nextLine().toCharArray();
        int cnt = 0;

        for (int i = 0; i < str.length; i++) {
            boolean isMatch = true;
            for (int j = 0; j < word.length; j++) {
                if (i + j >= str.length || str[i + j] != word[j]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                cnt++;
                i += word.length - 1;
            }
        }

        System.out.println(cnt);
    }
}
