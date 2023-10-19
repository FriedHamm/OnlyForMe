package Test1;

public class Singleton {
   private static Singleton singleton1 = new Singleton();
    private Singleton() {
    }

    public static Singleton getSingleton1() {
        return singleton1;
    }
}
