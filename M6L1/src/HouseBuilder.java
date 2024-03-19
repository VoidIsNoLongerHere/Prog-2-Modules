

// Abstract class defining the template method
abstract class HouseBuilder {
    // Template method

    public final void buildHouse() {
        buildFoundation();
        buildStructure();
        addRoof();
        addWalls();
        if (hasGarden()) {
            addGarden();
        }
        furnishHouse();
    }

    protected abstract void buildFoundation();

    protected abstract void buildStructure();

    protected abstract void addRoof();

    protected abstract void addWalls();

    protected void addGarden() {
        System.out.println("Adding a beautiful garden to the house.");
    }

    protected abstract void furnishHouse();

    protected boolean hasGarden() {
        return true;
    }
}