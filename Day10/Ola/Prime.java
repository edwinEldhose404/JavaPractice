package Day10.Ola;

public class Prime extends Ola{
    String pickup;
    String drop;
    float price;
    float rkm;

    Prime(String userName,long contact){
        super(userName, contact);
        this.userName = userName;
        this.contact = contact;
    }

    void bookCab(String pickup,String drop,float rkm){
        this.pickup = pickup;
        this.drop = drop;
        this.rkm = rkm;
        this.price = rkm*30;

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
    }
}
