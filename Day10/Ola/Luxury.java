package Day10.Ola;

public class Luxury extends Ola{
    String pickup;
    String drop;
    float price;
    float rkm;

    Luxury(String userName,long contact){
        super(userName, contact);
    }

    void bookCab(String pickup,String drop,float rkm){
        this.pickup = pickup;
        this.drop = drop;
        this.rkm = rkm;
        this.price = rkm*50;

        displayDetails();
    }

    void displayDetails(){
        if(this.pickup!=null){
            System.out.println(this.pickup+" - "+this.drop+" of distance "+this.rkm+" at price "+this.price);
        }
        else{
            System.out.println("No ride currently booked");
        }
        super.displayDetails();

    }

    void cancelRide(){
        this.pickup = null;
        this.drop = null;
        this.rkm = 0;
        this.price = 0;

        System.out.println("Ride cancelled");
    }
}