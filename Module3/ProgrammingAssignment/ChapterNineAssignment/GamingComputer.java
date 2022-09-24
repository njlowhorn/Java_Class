
package gamingcomputerbuild;

public class GamingComputer {
    private String name;
    private String manufacturingCompany;
    private String operatingSystem;
    private String processor;
    private String graphicsCard;
    private int randomAccessMemory;
    private int storage;

    public GamingComputer() {
    }//end GamingComputer empty constructor

    public GamingComputer(String name, String manufacturingCompany) {
        this.name = name;
        this.manufacturingCompany = manufacturingCompany;
    }//end GamingComputer constructor

    public GamingComputer(String processor, String graphicsCard, int randomAccessMemory, int storage) {
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.randomAccessMemory = randomAccessMemory;
        this.storage = storage;
    }//end GamingComputer constructor
    

    public String getName() {
        return name;
    }//end getName

    public void setName(String name) {
        this.name = name;
    }//end setName

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }//end getManufacturingCompany

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }//end setManufacturingCompany

    public String getOperatingSystem() {
        return operatingSystem;
    }//end getOperatingSystem

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }//end setOperatingSystem

    public String getProcessor() {
        return processor;
    }//end getProcessor

    public void setProcessor(String processor) {
        this.processor = processor;
    }//end setProcessor

    public String getGraphicsCard() {
        return graphicsCard;
    }//end getGraphicsCard

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }//end setGraphicsCard

    public int getRandomAccessMemory() {
        return randomAccessMemory;
    }//end getRandomAccessMemory

    public void setRandomAccessMemory(int randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }//end setRandomAccessMemory

    public int getStorage() {
        return storage;
    }//end getStorage

    public void setStorage(int storage) {
        this.storage = storage;
    }//end setStorage

    @Override
    public String toString() {
        String description = "The " + this.getManufacturingCompany() + " ";
        description += this.getName() + " has a ";
        description += this.getProcessor() + ", a ";
        description += this.getGraphicsCard() + ", ";
        description += this.getStorage() + " GB of storage, and ";
        description += this.getRandomAccessMemory() + " GB of ram.";
        return description;
    }//end toString

    @Override
    public boolean equals(Object obj) {
         GamingComputer gc2 = (GamingComputer)obj;
         return (this.getName().equals(gc2.getName()) && this.getManufacturingCompany().equals(gc2.getManufacturingCompany()));
    }//ends equals
    
    
    
    
}// end GmaingComputer class
