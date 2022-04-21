import java.util.*;
public class bro_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		char[][] arr = new char[A+10][B+10];
		
		// 체스판 만들기
		for(int i=0; i<A; i++){
			String str = sc.next();
			for(int j=0; j<B; j++)
			{
				arr[i][j] = str.charAt(j);
			}
		}
        //System.out.println(arr[4][6]);
        int count=0;
        if(arr[0][0]=='W'){
            for(int i=0; i<=A-8; i+=2){   
                for(int j=0; i<A; j++){
                    if(j%2==0){
                        if(arr[i][j]!='W'){
                            count++;
                        }
                    }else{
                        if(arr[i][j]!='B'){
                            count++;
                        }
                    }
                }

            }



        }else{
            for(int i=0; i<=A-8; i+=2){   
                for(int j=0; i<A; j++){
                    if(j%2==0){
                        if(arr[i][j]!='B'){
                            count++;
                        }
                    }else{
                        if(arr[i][j]!='W'){
                            count++;
                        }
                    }
                }

            }


        }


System.out.println(count);


        sc.close();

    }
    
}
