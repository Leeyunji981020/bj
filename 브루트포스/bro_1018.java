import java.util.*;
public class bro_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        char[][] arr = new char[A][B];
        String a ;
        sc.nextLine();

        for(int i=0; i<A; i++){
             a = sc.nextLine();
            for(int j=0; i<B; j++){
               arr[i][j] = a.charAt(j);
            }
            
        }

        int count=0;
        for(int i=0; i<A; i++){  
                if(arr[i][0]=='W'){
                    for(int j=1; i<A; j+=2){
                        if(arr[i][j]=='B'){
                            continue;
                        }else if(arr[i][j]=='W'){
                            count++;
                        }
                    }
                    for(int j=2; i<A; j+=2){
                        if(arr[i][j]=='W'){
                            continue;
                        }else if(arr[i][j]=='B'){
                            count++;
                        }
                    }


                }else if(arr[i][0]=='B'){
                    for(int j=1; i<A; j+=2){
                        if(arr[i][j]=='W'){
                            continue;
                        }else if(arr[i][j]=='B'){
                            count++;
                        }
                    }
                    for(int j=2; i<A; j+=2){
                        if(arr[i][j]=='B'){
                            continue;
                        }else if(arr[i][j]=='W'){
                            count++;
                        }
                    }


                }


            
        }
        System.out.println(count);
        sc.close();

    }
    
}
