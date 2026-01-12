package Day10;

public class Abstraction {
    //Abstract class
        //abstract class <class_name>{
            //abstract <AM> <returnType> <method_name>(<formal_args>);
        // }
            //"abstract" and <AM> can be interchanged

        //abstact classes have no body and do nothing which is the opposite of concrete methods
        //Concrete methods are fully implemented methods with a header, body and purpose

        //Upcasting can be used with abstract classes to make the class use child class methods

        //When a abstract class has a subclass abstract class, then the subclass wont have 
        // implementation
        //Concrete classes are required to implement the methods of the abstract classes 
        //that it inherits from

    //Interface class
        //100% abstraction and allows multiple inheritance
        //Syntax
            //class <class_name> implements <interface_name>{
                //<AM> <return_type> <method_nam>(<formal_args>);
            //}

        //If interface is a subclass of interface, USE EXTENDS
        //Multiple inheritance interface syntax:
            //interface <name1> extends <name2>, <name3>;

        //EXTENDS INHERITS BEHAVIOUR WHILE INTERFACE PROVIDES BEHAVIOUR
}
