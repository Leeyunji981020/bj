import java.util.Scanner;

public class helloworld{
    static Scanner scanner = new Scanner(System.in);
 public static void main(String[] args) {
    int A = scanner.nextInt();
    int B = scanner.nextInt();


    int B1 = B%10;
    int B2 = B/10;

    int C1 = B2%10;
    int C2 = B2/10;

    int D1 = C2%10;
    

    System.out.println(A*B1);
    System.out.println(A*C1);
    System.out.println(A*D1);
    System.out.println(A*B);



    

    


}
}