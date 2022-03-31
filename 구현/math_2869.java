
import java.io.IOException;

import java.util.*;


public class math_2869 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int V = sc.nextInt();

//         int num = 1;
//         int count=1;
//         while(num<=V){
//             num += A;
//             if(num!=V){
//                 num -=B;
//                 count++;
//             }
//         }

//         System.out.println(count);

// sc.close();

   // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(sc.nextLine()); // 넘나 유용

    double A = Integer.parseInt(st.nextToken());
    double B = Integer.parseInt(st.nextToken());
    double V = Integer.parseInt(st.nextToken());

    int day=0;
    day = (int)Math.ceil((V-A)/(A-B));
    System.out.println(day+1);
    sc.close();
    }
    
}
