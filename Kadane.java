//Max sum subarray

public class Kadane {
    public static void main(String[]args)
    {
        int a[]={-1,3,-3,6,7,-3,-5};
        int maxSum=kadaneAlgm(a);
        System.out.println(maxSum);
    }

    private static int kadaneAlgm(int[] a) {
        int maxEnd=a[0],maxSum=a[0];

        for(int i=1;i<a.length;i++)
        {
            maxEnd+=a[i];
            if(maxEnd<a[i])
                maxEnd=a[i];
            if(maxEnd>maxSum)
                maxSum=maxEnd;
        }
        return maxSum;
    }
}
