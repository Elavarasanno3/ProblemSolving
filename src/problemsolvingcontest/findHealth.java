package problemsolvingcontest;

import java.util.Arrays;

public class findHealth {
    public static int findHealth1(int [] arr){
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                int a = Math.min(arr[i],arr[j]);
                arr[j] = arr[j]-a;
            }
        }
        return arr[arr.length-1];
    }
}
