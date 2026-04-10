import java.util.*;

public class Fibbonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int ans = findFibb(n);

        System.out.println(ans);

    }

    static int findFibb(int n){

        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

       return findFibb(n-1) + findFibb(n-2);
    }
}
