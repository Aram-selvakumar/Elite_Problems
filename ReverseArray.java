public class ReverseArray{
    public static void main(String[]arg){
        int[] number={10,12,4,15};
        int start=0;
        int end=number.length-1;
        while(start<end){
            int temp=number[start];
            number[start]=number[end];
            number[end]=temp;
            start ++;
            end --;

        }
          System.out.println("Reversed array:");
        for (int num : number) {
            System.out.print(num + " ");
        }
    }
}