public class RotateArray {

    static void rotate(int[] arr, int k){
        int n = arr.length;
        k %= n;
        int[] ans = new int[n];
        int j = 0;

        for(int i = n-k; i < n; i ++){
            ans[j++] = arr[i];
        }
        for(int i = 0; i<n-k; i++){
            ans[j++] = arr[i];
        }

        print(ans);
    }

    static void print(int[] arr){
        for(int val : arr) {
            System.out.print(val+" ");
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        rotate(arr,201);
    }
}
