import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        if(a>1){
            a = 1-a;
        }else a = 1-a;

        if(b>1){
            b = 1-b;
        }else b = 1-b;

        if(c>2){
            c = 2-c;
        }else c = 2-c;

        if(d>2){
            d = 2-d;
        }else d = 2-d;

        if(e>2){
            e = 2-e;
        }else e = 2-e;

        if(f>8){
            f = 8-f;
        }else f = 8-f;

        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
    }
}