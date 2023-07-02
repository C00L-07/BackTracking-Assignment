import java.util.ArrayList;

public class PrintPermutation {
    static void print(int[] arr , int idx , ArrayList<Integer> ans)
    {
        int n = arr.length;
        if(idx==n)
        {
            if(!ans.isEmpty()) {
                System.out.println(ans);
            }
            return;
        }

        ans.add(arr[idx]);
        print(arr,idx+1,ans);
        ans.remove(ans.size()-1);
        print(arr,idx+1,ans);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        print(arr,0,ans);
    }
}
