import java.util.Arrays;
public class TwoSum {

    public static void main(String[] args){

        int[] arr =  {1,2,3,4,5};
        reverse(arr);
    }

    // function to reverse array in place

    public static void reverse(int[] arr){
        int n = arr.length-1;
        int i = 0, j = n;
        while(i < j){
            arr[i] += arr[j];
            arr[j]  = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];

            i++;
            j--;
        }
        for(int k = 0; k<=n; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
