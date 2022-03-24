import java.util.*;
public class stack_10773 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array = new int[num];
        // 스택 생성
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<num; i++){
            array[i] = sc.nextInt();// 일단 여기에 다 넣어주고 
            
        }
        for(int i=0; i<array.length; i++){
            if(array[i]==0){
                stack.pop();
            }
            else{
                stack.push(array[i]);
            }
        }
        int size=0;
        if(stack.isEmpty()){
            System.out.println("0");
        }else{
            while(true){
                if(stack.isEmpty()){
                    System.out.println(size);
                    break;
                }
                size += stack.pop();
            }
          
        }

        sc.close();
    }
}
