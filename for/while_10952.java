import java.util.*;


public class while_10952 {
    public static void main(String[]args) {
     
        Scanner scanner = new Scanner(System.in);

        
        int b,c;
        while(scanner.hasNextInt()){
            // 입력을 기다리다가 입력이 생기면 while 실행
             b = scanner.nextInt();
            c = scanner.nextInt();
         
            System.out.println(b+c);
        }




        scanner.close();

    }
}

