package Day11;

public class HashcodeMethod {
    //If you override equals(), you must override hashCode().

    // Rules:
    // If a.equals(b) is true
    // a.hashCode() == b.hashCode() must also be true

    // If a.hashCode() == b.hashCode()
    // equals() may or may not be true
    // (collisions are allowed)
    public static void main(String[] args) {
        System.out.println(Hash.hashing("Hell"));
    }

}

class Hash{
    static int hashing(String name){
        return name.hashCode();
    }
}
