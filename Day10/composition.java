package Day10;

public class composition {
    public static void main(String[] args){
        Engine e = new Engine(2030);
        Car c1 = new Car("Swift",e);
        System.out.println(c1.name);
        System.out.println(c1.e.eno);

        //Below line destroys c1 along with e
        //c1=null
    }
}

class Engine{
    int eno = 10;
    Engine(int eno){
        this.eno = eno;
    }
}

class Car{
    String name = "City";
    Engine e = new Engine(20);

    Car(String name,Engine e){
        this.name = name;
        this.e = e;
    }
}
