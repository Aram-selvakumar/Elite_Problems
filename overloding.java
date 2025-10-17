public class overloding{
    void car(int a,int b){
        System.out.println(a+b);
    }
    void car(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[]args){
        overloding price=new overloding();
        price.car(3,4);
        price.car(4,5,2);
    }
}