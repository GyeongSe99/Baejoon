import java.util.Scanner;

// 소금 폭탄
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] now = sc.next().split(":");
        String[] salt = sc.next().split(":");
        int[] nowTimes = new int[now.length];
        int[] saltTimes = new int[salt.length];

        for (int i = 0; i < now.length; i++) {
            nowTimes[i] = Integer.parseInt(now[i]);
        }
        for (int i = 0; i < now.length; i++) {
            saltTimes[i] = Integer.parseInt(salt[i]);
        }

        int nowTime = nowTimes[0] * 3600 + nowTimes[1] * 60 + nowTimes[2];
        int saltTime = saltTimes[0] * 3600 + saltTimes[1] * 60 + saltTimes[2];
        int needTime = saltTime - nowTime;
        if (needTime <= 0) {
            needTime += 24 * 3600;
        }
        int hour = needTime / 3600;
        int min = (needTime % 3600) / 60;
        int sec = needTime % 60;


        System.out.printf("%02d:%02d:%02d", hour, min, sec);
    }
}