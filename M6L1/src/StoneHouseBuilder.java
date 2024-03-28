public class StoneHouseBuilder extends HouseBuilder{



    protected void getStone(){
        System.out.println("Getting stone for the house");
    }

    @Override
    protected void buildFoundation() {
        getStone();
        System.out.println("Building Stone Foundation");
    }

    @Override
    protected void buildStructure() {
        System.out.println("Building stone structure.");
    }

    @Override
    protected void addRoof() {
        System.out.println("Adding a stone roof to the house");
    }

    @Override
    protected void addWalls() {
        System.out.println("Adding stone walls to the house.");
    }

    @Override
    protected void furnishHouse() {
        System.out.println("Furnishing the Stone house.");
    }

    protected boolean hasGarden(){
        return false;
    }
}
