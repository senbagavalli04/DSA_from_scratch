public class Solution {
    public static void nNumberTriangle(int n) {
        int flag = 1;
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
            System.out.print(flag+" ");
                flag++;
            }
              flag=1;
        
            System.out.println();
        }
      
    }
}
