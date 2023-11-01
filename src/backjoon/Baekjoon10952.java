package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a;
        int b;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a == 0 & b == 0) {
                break;
            }
            System.out.println(a + b);
        }
    }
}