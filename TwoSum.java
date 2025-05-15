import java.util.Arrays;

public class TwoSum {
    public static void main(String[]args)
    {
        int a[]={-8, 1, 4, 6, 10, 45},target=16;
        int res[]=twoSum(a,target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] a,int target) {
        int left=0,right=a.length-1;
         Arrays.sort(a);
        while(left<=right)
        {
            if(a[right]+a[left]==target)
            {
                return new int[]{left,right};
            }
            else if(a[right]+a[left]>target){
               right--;
            }
            else if(a[left]<target)
            {
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}
