package Day13;

@FunctionalInterface
interface Adder{
    int add(int x,int y);
}

public class Lamda3 {
    public static void main(String[] args){
        Adder sum = (x,y) -> x + y;

        System.out.println(sum.add(3,4));
    }
}
