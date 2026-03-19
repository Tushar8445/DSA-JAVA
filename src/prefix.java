public class prefix {

    public static void main(String[] args){
        int[] arr = {2,4,3,1,5};
        prefixSum(arr);

    }
    public static void prefixSum(int[] arr){
        for(int i = 1; i< arr.length; i++){
            arr[i] += arr[i-1];
        }

        for (int j : arr) {
            System.out.print(j+" ");
        }
    }
}
