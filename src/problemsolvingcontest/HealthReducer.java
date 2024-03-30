package problemsolvingcontest;

import java.util.Arrays;

public class HealthReducer {
    public static void main(String[] args) {
        int []arr = {4,6,8};
        int []arr2 = {4,1,5,3};
        System.out.println(findGCD(arr));
        System.out.println(findGCD(arr2));
    }

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    static int findGCD(int[] arr)
    {
        Arrays.sort(arr);
        int result = arr[0];
        for (int element: arr){
            result = gcd(result, element);

            if(result == 1)
            {
                return 1;
            }
        }

        return result;
    }
}
