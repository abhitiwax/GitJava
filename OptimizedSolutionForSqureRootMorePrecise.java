public class OptimizedSolutionForSqureRootMorePrecise {
    static float sqrt(int num){
        int start=0,end=num,mid;
        float f=0.1f;
        while(start<end){
            mid=start+(end-start)/2;
            if(mid*mid==num){
                return mid;
            }
            if(mid*mid>num){
                end=mid-1;
            }
            if(mid*mid<num){
                start=mid+1;
            }
        }
       float t= end+f;
       for(int i=0;i<5;i++){
           while(t*t<=num){
               t+=f;
           }
           t-=f;
           f/=10;
       }
       return t;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(50));
    }
}
