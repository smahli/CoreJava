public class CountTest {
    static int count=0;        //   if int count =0 is there then what will happen
    CountTest(){
        count++;
        System.out.println(count);       //  output will change because of static variable
                                        // static variable belong to the class not object so static will print 1 2 3
                                        // if static will not be there then only 1 1 1 will be printed because every time count will with initialised with 0

    }

    public static void main(String[] args) {
        CountTest c1= new CountTest();
        CountTest c2= new CountTest();
        CountTest c3= new CountTest();

    }
}
