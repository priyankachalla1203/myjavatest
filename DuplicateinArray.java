// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int a[] = {100,600,600,200,100,300};
        int num= 100;
        int count=0;
        for(int i:a)
        {
            if(i==num)
            {
            count++;
             a[1]=100;
            }
            
        }
        System.out.println("The repeated number is:"+count);
        System.out.println(Arrays.toString(a));
         }
}