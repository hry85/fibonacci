import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n , x = 0 , y = 1  , z;


        Scanner sc= new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayisini giriniz : ");
        n=sc.nextInt();
        System.out.print(x+" ");
        System.out.print(y+" ");

        for (int i = 1 ; i < n ; i++ ){
            z = x + y;

            System.out.print(z+" ");
            x = y;
            y = z;


            }
    }

}
