public class test8 { // application contain instance and local priority goes to local but like to priority goes instance
    int a=89; // instance variable                                        use this keyword given variable
    int m1(int a){        // local variable
        System.out.println("m1 method");
        return a;
    }
    public static void main(String agr[]){
        test8 t=new test8();
        t.m1(56);
    }
}
