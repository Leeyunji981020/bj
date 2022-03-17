import java.util.*;
public class array_2562{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int array[] = new int[9];
        int count=0;
        for(int i=0; i<9; i++){
            array[i] = scanner.nextInt();
        }
        int max = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
                count=i+1;
            }
            
        }
        
        System.out.println(max);
        System.out.println(count);
        scanner.close();
    }
}
