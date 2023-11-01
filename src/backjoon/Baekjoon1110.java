package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int result = num;
        int count = 0;

        while (true){
            int a = (num % 10) * 10;
            int b = (((num / 10) + (num % 10)) % 10);
            num = a + b;

            count++;

            if (result == num){
                break;
            }
        }
        System.out.println(count);
    }
}