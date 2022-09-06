public class BrutforceForSqureRoot {
    static float sqrt(int num){
        float temp=0.1f,temp1=0.01f;
        for(int i=1;i<num;i++){
            if(i*i>num){
                float f=(i-1)+temp+temp1;
                if(f*f>(float)num){
                    return (float)(f-0.01);
                }
                if(0.09==temp1) {
                    temp += 0.1;
                   temp1=0;
                }
                temp1+=0.01;
                i -= 1;
            }
            if(i*i==num){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
}
