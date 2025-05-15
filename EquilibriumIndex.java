public class EquilibriumIndex {
    public static void main(String[]args){
        int a[]={-7, 1, 5, 2, -4, 3, 0};
        int index=
                findEquilibrium(a);
        System.out.println(index);
    }

    private static int findEquilibrium(int[] a) {
        int totalSum=0,leftSum=0,rightsum=0;

        for(int i:a)
            totalSum+=i;
        for(int i:a)
        {
            totalSum-=i;

            if(totalSum==leftSum)
                return i;
            leftSum+=i;
        }
        return -1;
    }
}
