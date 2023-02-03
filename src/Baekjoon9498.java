import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int score = Integer.parseInt(st.nextToken());

        if (90<=score){
            System.out.println("A");
        } else if (80<=score) {
            System.out.println("B");
        } else if (70<=score) {
            System.out.println("C");
        } else if (60<=score) {
            System.out.println("D");
        } else System.out.println("F");
    }
}