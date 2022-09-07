import java.util.ArrayList;
public class Factors{
    static void factors(int num){
        ArrayList<Integer> list=new ArrayList<>();
        int i=1;
        while(i*i<=num){
            if((num%i)==0){
                System.out.print(i+" ");
              if(num/i!=i) {
                  list.add(num / i);
              }
            }
            i++;
        }
        for(int j=list.size()-1;j>=0;j--){
            System.out.print(list.get(j)+" ");
        }
    }
    public static void main(String[] args){
        factors(47);
    }
}