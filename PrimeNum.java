public class PrimeNum{
static void prime(int n,boolean[] b){
for(int i=2;i*i<=n && i<10;i++){
            if(!b[i]){
                for(int j=2*i;j<=n;j+=i){
                    b[j]=true;
                }
            }
        }
 for(int i=2;i<=n;i++){
            if(!b[i]){
                System.out.println(i);
            }
        }
    }
public static void main(String[] args){
int n=50;
//Decreasing Time Complexity by increasing Space Complexity.
boolean[] b=new boolean[n+1];
prime(n,b);
}
}