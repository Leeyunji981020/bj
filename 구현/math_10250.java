import java.io.*;
import java.util.*;
public class math_10250 {
    public static void main(String[] args) throws IOException{
        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int num = Integer.parseInt(br.readLine());
        // sc.nextLine();
        for(int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
           
            
            
            int floor= Integer.parseInt(st.nextToken());
            int room = Integer.parseInt(st.nextToken());
            int where = Integer.parseInt(st.nextToken());
            
            //int[][]arr = new int[floor+1][room+1];// 엘베 하나 빼놓고 1호부터 하려고a
            int a = (where%floor);
            int b = (where/floor);
    
            if(a==0){
                if(b<10){
                    System.out.println(a+"0"+b+1);
                }else{
                    System.out.print(a);
                    System.out.println(b+1);
                    
                }
            } else if(a == 0){
                if(b<10){
                    System.out.println(b+"0"+floor);
                }else{
                    System.out.print(b);
                    System.out.println(floor);
                    
                }
            }
            
            else{
               
                if(b<10){
                    System.out.println(a+"0"+b+1);

                }else{
                    System.out.print(a);
                    System.out.println(b+1);
                }

            }
            //int A = (where/floor)+1;
           // int B = where%floor;

            //System.out.println(B+"0"+A);
           
           // sc.nextLine();

        }

       // sc.close(); 
       }
    
}
