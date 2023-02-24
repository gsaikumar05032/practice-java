public class emp {
    int eid;
    String ename;
    float fsal;
    emp(){
        eid=111;
        ename="sai";
        fsal=10000f;
    }
    void display(){
        System.out.println("emp id="+eid);
        System.out.println("emp ename="+ename);
        System.out.println("emp fsal="+fsal);
    }
    public static void main(String agr[]){
        emp e=new emp();
        e.display();
    }
}
