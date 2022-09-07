import java.util.Random;

public class Password {
    static String password(int n){
        StringBuilder sd=new StringBuilder(n);
        Random rd=new Random();
        for(int i=0;i<n;i++){
            sd.append((char)rd.nextInt(32,127));
        }
        return sd.toString();
    }
    public static void main(String[] args) {
        while(true) {
            System.out.println(password(4));
        }
    }
}