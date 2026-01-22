package Day13;

@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Lambda {
    public static void main(String[] args){

        //Tradtional annonymous
        Greeting g = new Greeting() {public void sayHello()
            {System.out.println("Hello human");};};

        //Lambda
        Greeting g1 = () -> System.out.println("Hello human * 2");

        g.sayHello();
        g1.sayHello();
    }
}
