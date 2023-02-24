public class test5 {
    int a=45; // instance variable
    int b=89;
    void add(int a, int b){ // local variable
        System.out.println(a+b);
        System.out.println(this.a+this.b);
    }
    public static void main(String agr[]){
        test5 t=new test5();
        t.add(345,567);
    }
}
