import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    public static void main(String[]args){
        int a[]={ 1, 4, 45, 6, 10, 8 };
        int target=23;
       int res[]=fourSum(a,target);
       System.out.println(Arrays.toString(res));
    }

    private static int[] fourSum(int[] a, int target) {


        Arrays.sort(a);
        for(int i=0;i<a.length-3;i++)
        {
            for(int j=i+1;j<a.length-2;j++)
            {
                int l=j+1,r=a.length-1;
                while(l<r)
                {
                    int sum=a[i]+a[j]+a[l]+a[r];

                    if(target==sum)
                        return new int[]{a[i],a[j],a[l],a[r]};
                    else if(sum<target)
                        l++;
                    else
                        r--;
                }
            }
        }
        return new int[]{-1};
    }
}
