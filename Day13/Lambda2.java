package Day13;

@FunctionalInterface
interface Printer{
    void print(String msg);
}

public class Lambda2 {
    public static void main(String[] args){
        Printer p = msg -> System.out.println("Message "+msg);

        p.print("is here");
    }
}
