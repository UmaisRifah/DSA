import java.util.*;


public class h_arraySpan {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        

        int[] arr = new int[n];
        for(int i = 0;i< arr.length;i++){
            arr[i] = scr.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }if(arr[i]<min){
                min = arr[i];
            }
        }
        
        scr.close();
        int span = max - min;
        System.out.print(span);
    }
}
