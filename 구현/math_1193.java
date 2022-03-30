import java.util.*;
public class math_1193{

    public static void main(String [] args){

        int a=1;
        int n;   
        Scanner scan = new Scanner(System.in);
        n= scan.nextInt();
        //a 구하기
        while(n>a) {
            n-=a;
            a++;
        }

        //a가 짝수인지 홀수인지에 따른 결과값(분수) 출력

        if(a%2==0) {
            System.out.println(n+"/"+(a-n+1));

        }else {
            System.out.println((a-n+1)+"/"+n);
        }
scan.close();
    }

}