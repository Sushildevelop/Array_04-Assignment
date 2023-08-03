package Practice.Array.Array_04.Assignment;

import java.util.Arrays;

public class MiniumPaltform {
    static int countPlatforms(int n,int arr[],int dep[])
    {
        int ans=1; //final value
        for(int i=0;i<=n-1;i++)
        {
            int count=1; // count of overlapping interval of only this   iteration
            for(int j=i+1;j<=n-1;j++)
            {
                if((arr[i]>=arr[j] && arr[i]<=dep[j]) ||
                        (arr[j]>=arr[i] && arr[j]<=dep[i]))
                {
                    count++;
                }
            }
            ans=Math.max(ans,count); //updating the value
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arrival = { 900, 940, 950, 1100, 1500, 1800 };
        int[] departure = { 910, 1200, 1120, 1130, 1900, 2000 };
     int n=arrival.length;
        int minPlatforms = countPlatforms(n,arrival, departure);
        System.out.println("Minimum number of platforms needed: " + minPlatforms);
    }
}
