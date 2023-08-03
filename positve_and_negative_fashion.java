package Practice.Array.Array_04.Assignment;

import java.util.Scanner;

public class positve_and_negative_fashion {
    public static void rearrange(int[] arr) {
        int n = arr.length;

        int positiveIndex = 0;
        while (positiveIndex < n && arr[positiveIndex] >= 0) {
            positiveIndex++;
        }

        int negativeIndex = positiveIndex + 1;
        while (positiveIndex < n && negativeIndex < n) {
            // Swap positive and negative numbers
            if (arr[positiveIndex] < 0 && arr[negativeIndex] >= 0) {
                int temp = arr[positiveIndex];
                arr[positiveIndex] = arr[negativeIndex];
                arr[negativeIndex] = temp;
                positiveIndex += 2;
                negativeIndex += 2;
            } else if (arr[positiveIndex] >= 0) {
                // Find next positive number
                while (positiveIndex < n && arr[positiveIndex] >= 0) {
                    positiveIndex++;
                }
            } else if (arr[negativeIndex] < 0) {
                // Find next negative number
                while (negativeIndex < n && arr[negativeIndex] < 0) {
                    negativeIndex++;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }

        rearrange(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
