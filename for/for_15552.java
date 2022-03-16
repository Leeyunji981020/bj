import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class for_15552 {
  
    public static void main(String[] args) throws IOException{
     // 예외처리를 꼭 해줘야 한다.
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     // buggeredReader은 Scanner와 유사
     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
     StringTokenizer st;
        // 한줄에 여라 입력을 하기 위하여 StringTokenizer사용
     int t = Integer.parseInt(br.readLine());
     for(int i=0; i<t; i++){
         st = new StringTokenizer(br.readLine()," ");
         
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         bw.write(a+b+ "\n");
         
         // 버터에 있는 데이터를 비움과 동시에 콘솔에 출력

     }

     bw.close();
     br.close();
     // 입력이 끝나면 꼭 Scanner처럼 닫아줘야 한다.
    }   
}
