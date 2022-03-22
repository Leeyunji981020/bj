import java.util.*;
public class String_1157 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().toUpperCase();
        //Character[] word2 = new Character[word.length()];

        // for(int i=0; i<word.length(); i++){
        //     word2[i] = word.charAt(i);
        // }

        int[] a = new int[26];

        for(int i=0; i<word.length(); i++){
            int number = word.charAt(i)-65;
            a[number]++;

        }
        int max = -1;
        char xx='?';

        for(int i=0; i<26; i++){
            if(a[i]>max){
                max = a[i];
                xx = (char)(i + 65);
                    //나는 왜 max로 햇지?-> 바보엿어 ㅜㅜ
            }else if(max==a[i]){
                xx = '?';
            }
        }
        System.out.println(xx);

        sc.close();
    }
    
}
