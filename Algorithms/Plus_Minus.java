import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double positiveCount = 0;
        double negativeCount = 0;
        double zeroCount = 0;
        
        for(int x = 0; x < arr.length; x++){
            if (arr[x] == 0){
                zeroCount++;
            }
            else if(arr[x] > 0){
                positiveCount++;
            }
            else{
                negativeCount++;
            }
        }
        System.out.println(positiveCount/arr.length);
        System.out.println(negativeCount/arr.length);
        System.out.println(zeroCount/arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
