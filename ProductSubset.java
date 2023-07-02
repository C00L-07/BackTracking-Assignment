public class ProductSubset {
    static boolean isSubsetProductEqual(int[] arr, int target, int idx, int currentProduct) {
        // Base Condition
        if (currentProduct == target) {
            return true;
        }
        if (idx == arr.length || currentProduct > target) {
            return false;
        }

        // Recursive calls
        // Include the current element
        boolean include = isSubsetProductEqual(arr, target, idx + 1, currentProduct * arr[idx]);

        // Exclude the current element
        boolean exclude = isSubsetProductEqual(arr, target, idx + 1, currentProduct);

        return include || exclude;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 4};
        int target = 17;
        boolean subsetProductEqual = isSubsetProductEqual(arr, target, 0, 1);
        System.out.println(subsetProductEqual);
    }
}



