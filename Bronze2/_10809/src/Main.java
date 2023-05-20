import java.util.Scanner;

// 알파벳 찾기
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (int i = 0; i <= 'z' - 'a'; i++) {
            if (i == 'z' - 'a') {
                System.out.print(word.indexOf((char)(i + 'a')));
            } else {
                System.out.print(word.indexOf((char)(i + 'a')) + " ");
            }
        }

    }
}