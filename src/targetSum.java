import java.util.*;
public class targetSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = {2,5,3,6,1,0};

        System.out.println("Enter target element: ");
        int target = sc.nextInt();

        for (int i =0; i<arr.length; i++){
            for(int j = i+1;j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.print("Target found at index: ("+i+","+j+ ")");
                }
            }
            System.out.println();
        }

    }
}
