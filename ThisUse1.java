public class ThisUse1 {

        int i ; // instance variable
        void setValues( int i){   // local variable
            this.i=i;            // if instance variable and local variable are same
            // then compiler will print 0 why ? because inside that method only local variable assigned to itself  for eg(i=i) therefore avoiding this "this " keyword
            //   is introduced if both variable different then no problem.
            // this.i refers to Current class Instance variable

        }
        void show(){
            System.out.println(i);
        }
    }
    class Test2{
        public static void main(String[] args) {
            ThisTest t = new ThisTest();
            t.setValues(100);
            t.show();

        }
    }


