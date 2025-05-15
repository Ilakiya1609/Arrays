import java.util.Arrays;

public class DutchFlagAlgm {
    public static void main(String[]args)
    {
        int a[]={2, 0, 1, 2, 1, 1, 0,2};
        dutchFlagAlgm(a);
        System.out.println(Arrays.toString(a));
    }

    private static void dutchFlagAlgm(int[] a) {
        int l=0,h=a.length-1,mid=0;
        while(mid<=h){
            if(a[mid]==0) {
                int temp=a[mid];
                a[mid]=a[l];
                a[l]=temp;
                l++;mid++;
            }
            else if(a[mid]==2)
            {
                int temp=a[mid];
                a[mid]=a[h];
                a[h]=temp;
                h--;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
        }

    }


}
