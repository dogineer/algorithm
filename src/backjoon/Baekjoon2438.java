package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i=0; i<n; i++){
            for (int l=0; l<=i; l++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}