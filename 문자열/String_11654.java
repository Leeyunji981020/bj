import java.util.Scanner;

public class String_11654 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        // scanner로 char을 입력받는건 없다. 
        // scan.next로 입력 받고 .charAt(0)으로
        // 첫전째 글자를 가져오면 된다.
        int b= (int)a;
        System.out.println(b);

        scanner.close();
    }
}
