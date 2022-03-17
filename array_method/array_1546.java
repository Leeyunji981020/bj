import java.util.*;
public class array_1546 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double array[] = new double[n];

        double max=0;
        double result=0;
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();

        }
         Arrays.sort(array);
        max = array[n-1];

        for(int i=0; i<n; i++){
            result += (array[i]/max)*100;
        }
        double avg = 0;
        avg = result / array.length;
        System.out.println(avg);


        scanner.close();
    }

}
