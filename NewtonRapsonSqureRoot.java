public class NewtonRapsonSqureRoot{
static double sqrt(int num){
double x=num,root;
while(true){
  root=(x+num/x)/2;
  if(Math.abs(root-x)<1){
     break;
    }
    x=root;
  }
  return root;
 }
  public static void main(String[] args){
  System.out.print(sqrt(40));
 }
}