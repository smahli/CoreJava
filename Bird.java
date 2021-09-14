public interface Bird {
  public void show();
}
class Sparrow implements Bird{
    public void show(){
        System.out.println("1");

    }

    public static void main(String[] args) {
        Sparrow s = new Sparrow(); // we cannot create object of the Bird interface but we can create object of sparrow class
        s.show();
    }
}
