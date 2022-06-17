import java.util.*;
  
  public class c_checkPrime{
  
  public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      int t = scr.nextInt();
      for(int i=0;i<t;i++){
          int res=1;
          int n = scr.nextInt();
          if(n==1){
              res=0;
          }else if(n==2||n==3){
              res=1;
          }else if(n%2==0||n%3==0){
              res=0;
          }else{
              for(int k=5;k*k<=n;k=k+6){
                  if(n%k==0 || n%(k+1)==0){
                      res=0;
                  }
              }
          }
          if(res==1){
              System.out.println("prime");
          }else{
              System.out.println("not prime");
          }scr.close();
      }
  
  
   }
  }