import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr,int s,int e){
        if(s>=e){
            return;
        }
       int low=s;
       int hi=e;
       int mid=low+(hi-low)/2;
       int pivot=arr[mid];
       while(low<=hi){

               while(arr[low]<pivot){
                   low++;
               }
               while(arr[hi]>pivot){
                   hi--;
               }
               if(low<=hi){
                   swap(arr,low,hi);
                   low++;
                   hi--;
               }
       }
       quickSort(arr,s,hi);
       quickSort(arr,low,e);
    }
    static void quickSort1(int[] arr,int l,int h){
        if(l>=h){
            return;
        }
        int s=l;
        int e=h;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){

            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }
        quickSort(arr,l,mid);
        quickSort(arr,mid,h);
    }

    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void main(String[] args) {
        int[] arr={1,5,3,2,4};
        quickSort1(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
