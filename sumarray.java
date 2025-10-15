import java.util.Arrays;
public class sumarray{
    public static void main(String[]arg){
        int[]numbers={2,3,4,5,6};
        int sum=Arrays.stream(numbers).sum();
        System.out.println("Sum of Array="+sum);
    }
}