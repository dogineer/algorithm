package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] array = new int[num];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<num; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int search = Integer.parseInt(br.readLine());

        for (int i=0; i<array.length; i++){
            if(array[i] == search){
                count++;
            }
        }
        System.out.println(count);
    }
}