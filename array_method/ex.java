public class ex {

    private static int getDn(int n) {

        int Nn;
        Nn = n +n/10 + n%10;
    
    return Nn;  }

public static void main(String[] args){
    System.out.println(getDn(39));
}
}
