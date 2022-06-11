import java.util.*;

public class l_subOf2Arrays  {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n1 = scr.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0;i<arr1.length;i++){
            arr1[i] = scr.nextInt();
        }
        int n2 = scr.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0;i<arr2.length;i++){
            arr2[i] = scr.nextInt();
        }
        scr.close();
        int[] diff = new int[n2];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        int dif = 0;
        while(k>0){
            int d = dif;
            if(i>=0){
                d -= arr1[i];
            }
            if(j >=0){
                d += arr2[j];
            }
            if(arr2[j]<=arr1[i]){
                d += 10;
                dif = -1;
            }else{
                dif = 0;
            }
            diff[k]= d;
            i--;j--;k--;
        }
        int index = 0;
        while(index<diff.length){
            if(diff[index]==0){
                index++;
            }else{
                break;
            }
        }
        while(index<diff.length){
            System.out.print(diff[index]);
            index++;
        }
        
    }
}
