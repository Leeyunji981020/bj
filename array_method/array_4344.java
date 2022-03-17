// import java.util.*;

// public class array_4344 {
//     public static void main(String[]args){
//         Scanner scanner = new Scanner(System.in);
//         // 각 줄 마다 배열을 생성하면 됨
//         // testcase의 개수를 받은 다음
//         // 입력할 숫자의 개수를 또 받아서 그 숫자로 배열 만들면 됨
//         // 굳이 한 라인에 숫자를 다 받을 필요가 없는듯?

        
//         int[] array; // 배열 생성만 해줌
//         int testcase = scanner.nextInt(); // testCase의 개수 입력받기
        

//         for(int i=0; i<testcase; i++){
//             int num = scanner.nextInt();
//             array = new int[num];
//             double sum =0;
//             for(int j=0; j<num; j++){ 
//                 array[j] = scanner.nextInt();         
//                 sum += array[i];
//             }
//             //avg += sum/num;
//             double avg = (sum/num);
//             double count =0;

//             for(int j=0; j<num; j++){
//                 if(array[j]>avg){
//                     count ++;
//                 }
//             }
//             System.out.printf("%.3f%%\n",(count/num)*100);   

//         }
// scanner.close();
//     }
// }
import java.util.*;
public class array_4344{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] arr;
        int testcase = scanner.nextInt();

        for(int i=0; i<testcase; i++){
            int N = scanner.nextInt();
            arr = new int[N];

            double sum =0;

            for(int j=0; j<N; j++){
                int sNum = scanner.nextInt();
                arr[j] = sNum;
                sum += sNum;
            }
            double re = sum/N;
            double count = 0;

            for(int j=0; j<N; j++){
                if(arr[j] >re){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
        scanner.close();
    }
}