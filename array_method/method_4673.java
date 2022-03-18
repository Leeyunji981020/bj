
public class method_4673  {

    public static void main(String args[]) {
    
        boolean[] check = new boolean[10001];
        
        for(int i=1; i<10000; i++){
            int dn = getDn(i);

            if(dn<10001){
                check[dn]=true;
            }
        }
        for(int i=1; i<10000; i++){
            if(!check[i]){
                System.out.println(i);
            }
        }

     }
      private static int getDn(int n) {
    
        int Dn = n;
        while(n>0) {
        Dn = Dn + (n%10);
        n = n/10;
        }
        
        return Dn; }
    
    
    
    }

    
    