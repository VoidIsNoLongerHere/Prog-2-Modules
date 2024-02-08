public class Benefit {

    //Var
    float cost;
    String type, provider;

    //Constructor
    public Benefit(float cost, String type, String provider) {
        this.cost = cost;
        this.type = type;
        this.provider = provider;
    }

    public Benefit() {
        this.cost = 0;
        this.type = "";
        this.provider = "";
    }

    public Benefit(Benefit tBen) {
        this.cost = tBen.getCost();
        this.type = tBen.getType();
        this.provider = tBen.getProvider();
    }
    //Methods
    
    public void printInfo(){
        System.out.printf("Provider: %s", provider);
        System.out.printf("Type: %s", type);
        System.out.printf("Cost: $%f.2", cost);
    }

    //Get/Set

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
