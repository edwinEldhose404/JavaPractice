package Day11;

public class ToStringMethod {
    //Priority for class
        //interface
        //abstraction
        //class
        //final class
    public static void main (String[] args){

        /*
        * Methods of java.lang.Object with Modifiers
        *
        * // Reflection
        * public final Class<?> getClass() -> Returns runtime class of the object
        *
        * // Hashing & Equality
        * public int hashCode() -> Returns hash value of the object
        * public boolean equals(Object obj) -> Compares two objects for equality
        *
        * // Cloning
        * protected Object clone() throws CloneNotSupportedException 
        * -> Creates and returns a shallow copy of the object
        *
        * // String Representation
        * public String toString() -> Returns string representation of the object
        *
        * // Thread Communication
        * public final void notify() -> Wakes up one waiting thread
        * public final void notifyAll() -> Wakes up all waiting threads
        * 
        * public final void wait() throws InterruptedException 
        * -> Makes current thread wait
        * 
        * public final void wait(long timeout) throws InterruptedException 
        * -> Waits for specified milliseconds
        * 
        * public final void wait(long timeout, int nanos) throws InterruptedException 
        * -> Waits with nanoseconds precision
        * 
        *
        * // Garbage Collection (Deprecated since Java 9, removed in Java 18)
        * protected void finalize() throws Throwable -> Called by GC before destroying object
        *
        * Constructor
        * protected Object()
        */

        Details d1 = new Details("Edwin", 12345, 3500.01);
        System.out.println(d1.toString());

    }
    
}

class Details{
    String name;
    int contact;
    double balance;

    Details(String name, int contact, double balance){
        this.name = name;
        this.contact = contact;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return name+" "+contact+" "+balance;
    }
    
}

