public class KdivideSubset {
    static int countSubset(int[] arr,int target,int idx)
    {
        //Base Condition
        if(target == 0) return 1;
        if(target < 0) return 0;
        if(idx == arr.length) return 0;

        return countSubset(arr, target-arr[idx],idx+1) + countSubset(arr, target,idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,2};
        int target = 4;
        int ans = countSubset(arr,target,0);
        if(ans>0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}
