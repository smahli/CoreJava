public class Static2 {
    int Imp_id;
    String name;
     static  String Company= "Freelancer";

    void display(){
        System.out.println(Imp_id+" "+ name +" "+ Company);
    }
    Static2(int Imp_id,String name ){
        this.Imp_id=Imp_id;
        this.name = name;


    }

    public static void main(String[] args) {
        Static2 s = new Static2(101," Shiwshankar" );
                s.display();
        Static2 s2= new Static2(108,"Shambhu");
                s2.display();
    }
}
