package Day12;

public class StaticMethodOverloading {
    public static void main(String[] args){
        Vehicle.printer("Honda");
        Vehicle.printer(123);

    }
}

class Vehicle{
    static void printer(String sample){
        System.out.println(sample+" is a string");
    }

    static void printer(int number){
        System.out.println(number+" is a int");
    }
}
