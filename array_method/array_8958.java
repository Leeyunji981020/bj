// import java.util.*;
// public class array_8958 {
//     // 2:36 시작
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         String array[] = new String[n];
//         int score =0;
//         int semiscore =0;
//         String o = "O";
//         String x = "X";
//         // 숫자 입력 받기 
//         for(int i=0; i<n; i++){
//             array[i] = scanner.next();
//         }
        
//         for(int i=0; i<array.length; i++){

//             // O일때 
//             if(array[i].equals(o)){
//                semiscore++; 
//             }
    
//            else if(array[i].equals(x)){     
//           // X 일때
//           semiscore=0;
//            }
//           score += semiscore;

//         }
//         System.out.println(score);
//         scanner.close();
//     }
// }

// n개를 입력 받고 
// 한줄 입력 -> 한줄 출력 이런식으로 n번 돌리면 됨

 import java.util.*;
 public class array_8958 {
    // 2:36 시작
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] numArr = new String[num];
        int total = 0;
        int score =0;

        for(int i=0; i<num; i++){
            numArr[i]= scanner.next();
            for(int j=0; j<numArr[i].length(); j++){
                char a = numArr[i].charAt(j);
                if(a == 'O'){
                    score +=1;
                }else{
                    score =0;
                }
                total +=score;
                }
                System.out.println(total);
                score =0;
                total =0;
        }
        scanner.close();
    }
}