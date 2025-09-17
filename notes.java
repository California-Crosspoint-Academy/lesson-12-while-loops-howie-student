public class notes {
    public static void main(String[] args) {
        int sum = 0, j;
        for (j = 3; j <= 79; j++) {
            sum = sum + j;
        }
        System.out.println(sum);

        int sum2 = 0;
        int k = 3;
        while (k <= 179) {
            sum2 = sum2 + k;
            k++;
        }
        System.out.println(sum2);

        int sum3 = 0;
        int m = 3;
        do
        {
            sum3 = sum3 + m;
            m++;
        }
        while (m <= 279);
        System.out.println(sum3);
    }
}
