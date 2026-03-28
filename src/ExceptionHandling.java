import java.sql.SQLOutput;
import java.util.Scanner;
public class ExceptionHandling {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int n2 = sc.nextInt();

        try{
            System.out.println(n1/n2);
        }catch(Exception err){
            System.out.println(err+" You can not divide it ");
        }finally {
            System.out.println("This ");
        }
    }
}
