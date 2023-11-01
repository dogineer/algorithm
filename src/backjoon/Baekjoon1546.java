package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double score = 0;
        double fakeScore = 0;
        double max = 0;
        double result = 0;

        int count = Integer.parseInt(br.readLine());
        double[] array = new double[count];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<count; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);
        max = array[array.length-1];

        for (int i=0; i<count; i++){
            score = array[i];
            fakeScore = (score/max)*100;
            array[i] = fakeScore;
            result += array[i];
        }

        System.out.println(result/count);
    }
}