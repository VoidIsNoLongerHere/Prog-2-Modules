import java.util.Random;

public class ParkingPermit {
    int permitID;
    String carMake, carModel, carYear;





    //Constructors
    public ParkingPermit(String carMake, String carModel, String carYear) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYear = carYear;
        Random r = new Random();
        permitID = r.nextInt(1000,9999);
    }

    public ParkingPermit(ParkingPermit tPerm){
        this.carMake = tPerm.carMake;
        this.carModel = tPerm.carModel;
        this.carYear = tPerm.carYear;
        this.permitID = tPerm.permitID;
    }

    //Method
    public void printInfo(){
        System.out.println("Parking Permit\n-------------------");
        System.out.printf("Permit ID: %d\n", permitID);
        System.out.println("Vehicle: "+carYear +" "+ carMake +" "+ carModel);
    }
    //Get/set


    public int getPermitID() {
        return permitID;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }
}
