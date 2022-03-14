import java.util.Scanner;

public class for_10950{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int a = scanner.nextInt();
        int array[]  = new int[a];
        for(int i=0; i<a; i++){
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            array[i] = b+c;
        }

        for(int i=0; i<a; i++){
            System.out.println(array[i]);
        }


    }



}
