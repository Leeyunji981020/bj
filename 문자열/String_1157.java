import java.util.*;
public class String_1157 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().toUpperCase();
        Character[] word2 = new Character[word.length()];
        for(int i=0; i<word.length(); i++){
            word2[i] = word.charAt(i);
        }

        int[] a = new int[26];
        for(int i=0; i<word.length(); i++){
            int number = (int)word.charAt(i)-64;
            a[number]++;

        }
        int max = a[0];
        for(int i=0; i<26; i++){
            if(a[i]>max){
                max = a[i];

            }else if(max==a[i]){
                System.out.println("?");
            }
        }
        System.out.println(max);

        sc.close();
    }
    
}
