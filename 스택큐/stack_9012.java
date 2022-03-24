import java.util.*;
public class stack_9012 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int size = -1;
        for(int i=0; i<num; i++){
            String vps = sc.next();

            Stack<String> stack = new Stack<>();

            for(int j=0; j<vps.length(); j++){
                if(vps.charAt(j)=='('){
                    stack.push("(");
                 
                }else{
                    if(!stack.empty()){

                        stack.pop();
                    } else{
                        System.out.println("NO");
                     
                    }           
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
                
            }else{
                System.out.println("NO");
              
            }



        }
        sc.close();

    }
}


// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.*;

// public class Main {

// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
// 		int n = Integer.parseInt(br.readLine());
		
// 		for(int i = 0; i < n; i++) {
// 			Stack<Character> s = new Stack<>(); // 스택 선언
// 			String answer = "YES"; // 정답 표시 default YES
// 			String ps = br.readLine();
			
// 			for(int j = 0; j < ps.length(); j++) { // 괄호 확인
// 				if(ps.charAt(j) == '(') // '('일 경우 스택에 추가
// 					s.push(ps.charAt(j));
// 				else {
// 					if(!s.isEmpty()) // 스택이 비어있지 않을 경우 '(' 제거 
// 						s.pop();
// 					else { // 비어있지 않다면 성립 X
// 						answer = "NO"; 
// 						break;
// 					}
// 				}
// 			}
// 			if(!s.isEmpty()) // 스택이 맞아 떨어지지 않는다면 성립 X
// 				answer = "NO";
			
// 			System.out.println(answer);
// 		}
// 	}
// }


