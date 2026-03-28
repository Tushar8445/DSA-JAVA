public class SearchInsertPosition {
    public static void main(String[] args){

        int[] arr = {1,3,5,6};
        int ans = serachTarget(arr, 0);
        System.out.print(ans);
    }

    public static int serachTarget(int[] arr, int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("target at Index: "+i);
                return i;
            }else if(arr[i] > target){
                System.out.println("Target should be at index: "+i);
                return i;
            }
        }
        return arr.length;
    }
}
