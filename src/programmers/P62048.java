package programmers;

public class P62048 {

    public static long getGcd(int w, int h) {
        while (h != 0) {
            int temp = h;
            h = w % h;
            w = temp;
        }

        return w;
    }

    public static void main(String[] args) {

        int w = 8;
        int h = 12;
        long total = (long)w * (long)h;

        long gcd = getGcd(w, h);
        System.out.println();
        System.out.println("gcd = " + gcd);

        long answer = total - (((w / gcd) + (h / gcd) - 1) * gcd);

        System.out.println("result = " + answer);

    }
}
