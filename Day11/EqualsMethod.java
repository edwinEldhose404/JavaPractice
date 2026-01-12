package Day11;

public class EqualsMethod {
    public static void main(String[] args){
        //equals method checks if same ADDRESS VALUE while "==" is for checking if same ADDRESS

        // String s1 = new String("Hello");
        // String s2 = new String("Hello");

        // System.out.println(s1 == s2);      // false (different objects)
        // System.out.println(s1.equals(s2)); // true  (same content)



    }
}

class Student {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;

        Student s = (Student)obj;
        return this.id == s.id && this.name.equals(s.name);
    }
}
