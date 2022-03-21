import java.util.*;
public class String_5622 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String dial = sc.nextLine().toUpperCase();
        int answer =0;
        for(int i=0; i<dial.length(); i++){
            if(dial.charAt(i)=='A' || dial.charAt(i)=='B' || dial.charAt(i)=='C'){
              answer+=3;
            }else if(dial.charAt(i)=='D'||dial.charAt(i)=='E'||dial.charAt(i)=='F'){
                answer+=4;
            }else if(dial.charAt(i)=='G'||dial.charAt(i)=='H'||dial.charAt(i)=='I'){
                answer+=5;
            }
            else if(dial.charAt(i)=='J'||dial.charAt(i)=='K'||dial.charAt(i)=='L'){
                answer+=6;
            }
            else if(dial.charAt(i)=='M'||dial.charAt(i)=='N'||dial.charAt(i)=='O'){
                answer+=7;
            }
            else if(dial.charAt(i)=='P'||dial.charAt(i)=='Q'||dial.charAt(i)=='R'||dial.charAt(i)=='S'){
                answer+=8;
            }
            else if(dial.charAt(i)=='T'||dial.charAt(i)=='U'||dial.charAt(i)=='V'){
                answer+=9;
            }
            else if(dial.charAt(i)=='W'||dial.charAt(i)=='X'||dial.charAt(i)=='Y'||dial.charAt(i)=='Z'){
                answer+=10;
             } 
             //else if(dial.charAt(i)==0){
            //     answer+=10;
            // } else if(dial.charAt(i)==1){
            //     answer+=1;
            // }

        
        }
        System.out.println(answer);

        sc.close();
    }
    
}
