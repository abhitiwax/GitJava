import java.util.Arrays;
public class MergeSort {
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static void mergeSort1(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid=s+(e-s)/2;
        mergeSort1(arr,s,mid);
        mergeSort1(arr,mid,e);

        merge1(arr,s,mid,e);

    }
    static void merge1(int[] arr,int s,int m,int e){
        int[] merge1=new int[e-s];
        int p1=s,p2=m,c=0;
        while(p1<m && p2<e){
            if(arr[p1]<arr[p2]){
                merge1[c]=arr[p1];
                p1++;
                c++;
            }else{
                merge1[c]=arr[p2];
                        p2++;
                        c++;
            }
        }
        while(p1<m){
            merge1[c]=arr[p1];
            p1++;
            c++;
        }
        while(p2<e){
            merge1[c]=arr[p2];
            p2++;
            c++;
        }
        int count=0;
       for (int i=s;i<s+ merge1.length;i++){
           arr[i]=merge1[count];
           count++;
       }
    }
    static int[] merge(int[] l,int[] r){
        int[] merge=new int[(l.length+r.length)];
        int p1=0,p2=0,count=0;
        while(p1< l.length && p2<r.length){
            if(l[p1]<r[p2]){
                merge[count]=l[p1];
                p1++;
            }else{
                merge[count]=r[p2];
                p2++;
            }
            count++;
        }
        while(p1<l.length){
            merge[count]=l[p1];
            p1++;
            count++;
        }
        while (p2<r.length){
            merge[count]=r[p2];
            p2++;
            count++;
        }
        return merge;
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
       // System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSort1(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
