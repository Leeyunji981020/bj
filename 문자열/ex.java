import java.util.Scanner;

public class ex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        for(char i='a'; i<='z'; i++){
            //indexOf 문자열의 위치 찾아줌
            System.out.print(a.indexOf(i)+" ");
        }
    sc.close();
    }
    
}
