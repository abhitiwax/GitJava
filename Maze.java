import java.util.Arrays;
public class Maze {
    static void maze(int r,int c,String p){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            maze(r-1,c,p+"D");
        }
        if(c>1){
            maze(r,c-1,p+"R");
        }
    }
    static void maze1(String p,boolean[][] arr,int r,int c,int[][] ar,int count){

        if(r==2 && c==2){
            for (int[] a:ar) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            return;
        }
        if (r>=0 && c>=0){
        if (r <= 2 && c<=2 && arr[r][c] ) {
            ar[r][c] = count++;
            arr[r][c] = false;
            maze1(p + "D", arr, r + 1, c, ar, count);
            maze1(p + "R", arr, r, c + 1, ar, count);
            maze1(p + "u", arr, r - 1, c, ar, count);
            maze1(p + "L", arr, r, c - 1, ar, count);
            ar[r][c] = 0;
            arr[r][c] = true;
        }
        }
        }
    static void maze2(String p,int r,int c,int[][] ar,int count){

        if(r==2 && c==2){
            for (int[] a:ar) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            return;
        }
        if (r>=0 && c>=0){
            if (r <= 2 && c<=2 && ar[r][c]==0 ) {
                ar[r][c] = count++;
                maze2(p + "D", r + 1, c, ar, count);
                maze2(p + "R", r, c + 1, ar, count);
                maze2(p + "u", r - 1, c, ar, count);
                maze2(p + "L", r, c - 1, ar, count);
                ar[r][c] = 0;
            }
        }
    }
        public static void main(String[] args) {
        boolean[][] arr={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] ar={
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
       // maze(3,3,"");
        maze2("",0,0,ar,0);
    }
}
