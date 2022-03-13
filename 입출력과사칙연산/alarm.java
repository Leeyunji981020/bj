import java.util.Scanner;
public class alarm {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int a = scanner.nextInt();
      int b = scanner.nextInt();
      
      if(a==0){
         a =a+24;
      }
      int minute = (a*60 + b)-45;
      a = minute/60;
      b = minute%60;

         if(a>=24){
            a= a-24;
         }
         
      
      
      System.out.println(a +" "+b);


   }
}
