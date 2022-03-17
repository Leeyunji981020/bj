import java.util.*;
public class array_10818 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        //int min=100; 
        //int max=0;
        for(int i=0; i<n; i++){
            array[i] = scanner.nextInt();
        }

        // for(int i=0; i<array.length; i++){
        //     if(min>array[i]){
        //         min = array[i];
        //     }if(max<array[i]){
        //         max = array[i];
        //     }
        // }
        // 아니면 Arrays.sort(array)를 사용해서 정렬 해 주고
        // 0번째와 n-1번째 값을 꺼내면 된다.
         Arrays.sort(array);

        //System.out.println(min+ " "+max);
        System.out.println(array[0]+" "+array[n-1]);
     
        scanner.close();
    }
}
