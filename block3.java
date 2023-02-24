public class block3 {
    block3(){
        System.out.println("0- agrument");
    }
    block3(int a){
        System.out.println("1-agrument");
    }
    block3(int a,int b){
        System.out.println("2-agrument");
    }
    {
        System.out.println("instance block");
    }
    static{
        System.out.println("static block");
    }
    public static void main(String agr[]){
        new block3();
        new block3(90);
        new block3(89,87);
    }
}
