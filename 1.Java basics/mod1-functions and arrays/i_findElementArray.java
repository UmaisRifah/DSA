import java.util.*;

public class i_findElementArray{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];
        for(int i= 0;i<arr.length;i++){
            arr[i] = scr.nextInt();
        }
        int d = scr.nextInt();
        scr.close();
        int flag = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==d){
                System.out.print(i);
                flag = 1;
            }
        }
        if(flag==0){
            System.out.print("-1");
        }
        
    }
}
