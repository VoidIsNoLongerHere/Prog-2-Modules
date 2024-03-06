import java.text.NumberFormat;

public class Benefit implements Leaflet {

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

    public void printSelf(int depth){
        NumberFormat c = NumberFormat.getCurrencyInstance();
        System.out.println(tabs(depth++) + "Benefit:");
        System.out.println(tabs(depth)+"Provider: "+ provider);
        System.out.println(tabs(depth)+"Type: "+ type);
        System.out.println(tabs(depth)+"Cost: "+ c.format(cost));
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



    //Unused interface classes
    public void addChild(Leaflet child) {}
    public void printChildren(int depth) {

    }
}
