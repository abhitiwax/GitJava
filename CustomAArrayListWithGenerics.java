public class CustomAArrayListWithGenerics<T /*extends String*/> {
    private Object[] obj;
    private int initialSize=10;
    private int index=0;
    public CustomAArrayListWithGenerics(){

        this.obj =new Object[this.initialSize];
    }
    public void add(T n){
        isFull(index);
        this.obj[index]=n;
        index++;
    }
    private boolean isFull(int index){
        if(this.index== obj.length){
            initialSize=initialSize*2;
            Object[] t=new Object[this.initialSize];
            for (int i = 0; i < obj.length; i++) {
                t[i]= obj[i];
            }
            obj =t;
            return true;
        }
        return false;
    }
    public void remove(int INDEXER){
        try{
            int t=INDEXER-1;
            for (int i = t; i < obj.length; i++) {
                obj[i]=obj[i+1];
            }
            Object[] o=new Object[initialSize-1];
            for (int i = 0; i < initialSize-1; i++) {
                o[i]=obj[i];
            }
            obj=o;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public int get(int INDEX){
        try{
            return (int)(obj[INDEX]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        return (int)(obj[INDEX]);
    }
    public void clear(){
       Object[] o=new Object[0];
       obj=o;
    }
    public String toString() {
        String s = "[";
        for (int i = 0; i < obj.length; i++) {
            if (i < obj.length - 1) {
                if (obj[i + 1]==null) {
                    s += obj[i];
                    break;
                }
            }
            s += obj[i] + ",";
        }
        s += "]";
        return s;
    }

    public static void main(String[] args) {
        CustomAArrayListWithGenerics<Integer> list=new CustomAArrayListWithGenerics<>();
        for (int i = 1; i < 20; i++) {
            list.add(i*2);

        }
//     // list.remove(3);
//        list.clear();
        System.out.println(list);
    }
}
