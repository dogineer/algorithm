import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Baekjoon2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        int number = 0;
        int count = 0;
        int position = 0;
        int[] array = new int[9];

        while (true){
            if (count > array.length-1){
                break;
            } else {
                array[count] = Integer.parseInt(br.readLine());
                number = array[count];
                if (number > max){
                    max = number;
                    position = count+1;
                } count++;
            }
        }

        System.out.println(max);
        System.out.println(position);
    }
}