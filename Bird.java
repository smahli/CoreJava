 interface Bird {
  public void show();
  public static final  int i=0; // public static final must be added to a variable otherwise
  static void display(){
      System.out.println("This is static method");
  }
}
 interface Animals {
    void display();
}

 class Sparrow implements Bird,Animals{
    public void show(){
        System.out.println("1");

        }
        public void display(){
            System.out.println("2");

        }

public static void main(String[]args){
        Sparrow s=new Sparrow(); // we cannot create object of the Bird interface but we can create object of sparrow class
        s.show();
        s.display();
        }
 }
