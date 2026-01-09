package Day10.Ola;

class Ola{
    String userName;
    long contact;
    float uberAccBal;

    Ola(String userName,long contact){
        this.userName = userName;
        this.contact = contact;
    }

    void displayDetails(){
        System.out.println("Name: "+this.userName + " Contact: "+this.contact);
    }
}

public class olaMain {
    public static void main(String[] args){
        
        Luxury l1 = new Luxury("Edwin", 12345);
        Mini m2 = new Mini("Bob",98761);

        l1.bookCab("Central mall","Infopark",7.60f);
        l1.cancelRide();
        l1.displayDetails();
    }
}
