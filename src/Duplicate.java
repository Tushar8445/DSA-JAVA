public class Duplicate {
    public static void main(String[] args){

        int[] arr = {1,1,1,2,2,3,3,3,4,5,5};
        removeDuplicate(arr);
    }
    public static void removeDuplicate(int[] arr){

        int j = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        for(int q = j+1; q < arr.length; q++){
            arr[q] = 0;
        }
        for(int k: arr){
            System.out.print(k+" ");
        }
    }
}
