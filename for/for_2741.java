import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class for_2741{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for(int i=1; i<=t; i++){
            st =  new StringTokenizer(br.readLine());
            // readLine은 엔터키를 누를때 까지 계속 읽어들임.. 
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #"+i+": "+a+ " + "+b+ " = "+(a+b)+"\n");
            // 버퍼에 있는 값을 전부 출력
        }

        bw.close();
        br.close();


    }
    
}
