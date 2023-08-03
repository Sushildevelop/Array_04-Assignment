package Practice.Array.Array_04.Assignment;

import java.util.Scanner;

public class Repeating_Element {
    static int findFirstRepeatingElement(int [] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int resultIndex=findFirstRepeatingElement(arr);

        if (resultIndex !=-1){
            System.out.println("The first repeating element is: "+arr[resultIndex]+" at index "+resultIndex);
        }
        else {
            System.out.println("NO repeating element found: ");
        }
    }
}
