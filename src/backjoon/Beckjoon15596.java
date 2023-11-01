package backjoon;

public class Beckjoon15596 {
    public static long sum(int[] a) {
        long ans = 0;

        for(int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        System.out.println(sum(array));
    }
}
