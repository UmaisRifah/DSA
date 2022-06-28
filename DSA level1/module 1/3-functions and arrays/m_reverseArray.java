// import java.util.*;
import java.io.*;

public class m_reverseArray  {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<a.length/2;i++){
            int temp = a[i];
            a[i]= a[a.length-1-i];
            a[a.length-1-i] = temp; 
        }
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
    
      public static void reverse(int[] a){
        // write your code here
      }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        reverse(a);
        display(a);
    }
}
