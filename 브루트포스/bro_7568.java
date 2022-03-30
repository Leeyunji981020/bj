import java.util.*;
public class bro_7568 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num*2];
        // 몸무게 가장 큰거 찾고 그 사람의 키가 가장 크면 1등 주기
        for(int i=0; i<num*2; i++){
            arr[i] = sc.nextInt();
        }// 짝수는 몸무게 홀수는 키
        int count=0;
        int height = arr[1];
        int weight = arr[0];
        //정답 배열??
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=2; i<arr.length; i+=2){
            if(arr[i]>weight){
                weight = arr[i];
                for(int j=1; j<arr.length; j+=2){
                    if(arr[j]>height){
                        height = arr[j];
                        count++;
                    }
                    else{
                        count++;
                    }
    
                }
            }else{
                count++;
            }
            answer.add(count);

        }
        for(int i=0; i<answer.size(); i++){

            System.out.print(answer.get(i)+"\n");
        }
        sc.close();
    }
}
