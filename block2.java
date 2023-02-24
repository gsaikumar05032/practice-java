public class block2 {   //instance block exection depends on object creation
    block2(){
        System.out.println("0-agrument");
    }
    block2(int a){
        System.out.println("1-agrument");
    }
    block2(int a,int b){
        System.out.println("2-agrument");
    }
    {
        System.out.println("instance block-1");
    }
    {
        System.out.println("instance block-2"); // multiple instance block will print
    }
    public static void main(String agr[]){
        new block2();
        new block2(23);
        new block2(90,45);
    }
}
