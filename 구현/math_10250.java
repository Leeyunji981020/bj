import java.util.*;
public class math_10250 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            int floor= sc.nextInt();
            int room = sc.nextInt();
            int where = sc.nextInt();

            int[][]arr = new int[floor+1][room+1];// 엘베 하나 빼놓고 1호부터 하려고

            int A = (where/floor)+1;
            int B = where%floor;

            System.out.print(B+"0"+A);
           


        }



    }
    
}
