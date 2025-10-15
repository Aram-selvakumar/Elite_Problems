public class Sum{
    public static void main(String[]arg){
        int[] numbers={10,20,30,40};
        int sum=0;
        for(int i=1;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println("Sum Of numbers="+sum);
    }
}