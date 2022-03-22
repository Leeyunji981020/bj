import java.util.*;
public class String_1152 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().trim();
        // trim 이용하면 양쪽의 공백을 없애줌..
        String[] a;
        a = word.split(" ");
        // StringTokenizer을 사용하면
        // 양쪽 공백에 대한 예외처리 안해줘두 됨
        // StringTOkenizer st = new StringTokenizer(word," ");
        // st.countTokens()출력 하면 끝;
        if(word.isEmpty()){
            System.out.println("0");
        }else{

            System.out.println(a.length);
        }

            sc.close();

    }
    
}
