import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        int maxInt = arr[0];
        int minInt = arr[0];
        long totalCount = arr[0];
        
        for (int i = 1; i < arr.length; i++){
            totalCount+=arr[i];
            if (arr[i] > maxInt){
                maxInt = arr[i];
            }
            else if (arr[i] < minInt){
                minInt = arr[i];
            }
        }
        System.out.println((totalCount - maxInt) + " " + (totalCount - minInt));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
