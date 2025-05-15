import java.util.Arrays;

public class ThreeSum {
    public static void main(String[]args)
    {
        int a[]={1, 4, 45, 6, 10, 8 };
        int target=13;
        int res[]=threeSum(a,target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] threeSum(int[] a, int target) {
        for(int i=0;i<a.length-2;i++)
        {
            int l=i+1,r=a.length-1;
            int requiredSum=target-a[i];

            while(l<=r)
            {
                if(a[l]+a[r]==requiredSum)
                    return new int[]{a[i],a[l],a[r]};
                else if(a[l]+a[r]<requiredSum)

                    l++;
                else if(a[l]+a[r]>requiredSum)
                    r--;
            }
        }
        return new int[]{-1};
    }
}
