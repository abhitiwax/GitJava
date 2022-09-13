import java.util.Arrays;

public class CyclicSort {
    static void cyclicSort(int[] arr,int s,int e){
        if(s>e){
            return;
        }
        if(arr[s]!=s+1){
            swap(arr,arr[s]-1,s);
        }
        cyclicSort(arr,s+1,e);
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        cyclicSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
