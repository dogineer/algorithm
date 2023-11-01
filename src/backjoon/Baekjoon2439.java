package backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            for(int j=n; i+1<j; j--){
                System.out.print(" ");
            }

            for (int q=0; q<i+1; q++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}