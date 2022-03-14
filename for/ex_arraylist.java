import java.util.ArrayList;
import java.util.Scanner;

public class ex_arraylist{

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    ArrayList<Integer> arraylist = new ArrayList<>();
    int array[] = new int[a];

    for(int i=0; i<a; i++){
        array[i] = scanner.nextInt();
    }

    for(int i=0; i<a; i++){
        if(array[i]<b){
            arraylist.add(array[i]);
        }
    }
       for( Integer i : arraylist){
           System.out.print(i+" ");
       }

    }
}




