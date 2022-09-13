public class NextPrime {
    static int nxtPrime(int num,int s){
        while(s*s<num){
            if(num%s==0){
                break;
            }
            s++;
        }
        if(s*s>num){
            return num;
        }
        return nxtPrime(num+1,2);
    }

    public static void main(String[] args) {
        int num=23;
        System.out.println(nxtPrime(num+1,2));
    }
}
