import java.util.*;
public class method_15596 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // 몇개 입력할지

        for(int i=0; i<num; i++){
            int num2 = scanner.nextInt();
            int arr[] = new int[num2];
            double sum =0;
            for(int j=0; j<num2; j++){
                arr[j] = scanner.nextInt();
                sum += arr[j];
            }
            double avg = sum/num2;
            double count =0;
            for(int j=0; j<num2; j++){
                if(arr[j]>avg){
                    count += 1;
                }
            }
            System.out.printf("%.3f%%\n",(count/num2)*100);
        }



scanner.close();

        }


    }

 
    

