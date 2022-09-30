package gamingcomputerbuild;

/**
 * A parent class that has the information on different gaming computers
 * @author Nolan Lowhorn
 */
public class GamingComputer {
    private String name;
    private ManufacturingCompany manufacturingCompany;
    private String operatingSystem;
    private String processor;
    private String graphicsCard;
    private int randomAccessMemory;
    private int storage;

    /**
     * Default constructor
     */
    public GamingComputer() {
    }//end GamingComputer empty constructor

    /**
     * Constructor for getting the name and company of the computer
     * @param name String - Official title of the computer
     * @param manufacturingCompany ManufacturingCompany - Manufacturer that made the computer
     */
    public GamingComputer(String name, ManufacturingCompany manufacturingCompany) {
        this.name = name;
        this.manufacturingCompany = manufacturingCompany;
    }//end GamingComputer constructor

    /**
     * Constructor for getting the specifications of the computer
     * @param processor String - CPU of the computer
     * @param graphicsCard String - GPU of the computer
     * @param randomAccessMemory int - RAM in GB
     * @param storage int - Amount of space in GB
     */
    public GamingComputer(String processor, String graphicsCard, int randomAccessMemory, int storage) {
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.randomAccessMemory = randomAccessMemory;
        this.storage = storage;
    }//end GamingComputer constructor
    

    /**
     * Method that returns the name of the computer
     * @return String - Name of computer
     */
    public String getName() {
        return name;
    }//end getName

    /**
     * Method that changes the name of the computer
     * @param name String - Name of computer
     */
    public void setName(String name) {
        this.name = name;
    }//end setName

    
    /**
     * Method that returns the name of the manufacturing company
     * @return ManufacturingCompany - Name of manufacturing company
     */
    public ManufacturingCompany getManufacturingCompany() {
        return manufacturingCompany;
    }//end getManufacturingCompany

    /**
     * Method that changes the name of the manufacturing company
     * @param manufacturingCompany ManufacturingCompany - Name of manufacturing company
     */
    public void setManufacturingCompany(ManufacturingCompany manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }//end setManufacturingCompany

    /**
     * Method that returns the name of the operating system
     * @return String - Name of operating system
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }//end getOperatingSystem

    /**
     * Method that changes the name of the operating system
     * @param operatingSystem String - Name of operating system
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }//end setOperatingSystem

    /**
     * Method that returns the name of the processor
     * @return String - Name of processor
     */
    public String getProcessor() {
        return processor;
    }//end getProcessor

    
    /**
     * Method that changes the name of the processor
     * @param processor String - Name of processor
     */
    public void setProcessor(String processor) {
        this.processor = processor;
    }//end setProcessor

    /**
     * Method that returns the name of the graphics card
     * @return String - Name of graphics card
     */
    public String getGraphicsCard() {
        return graphicsCard;
    }//end getGraphicsCard

    /**
     * Method that changes the name of the graphics card
     * @param graphicsCard String - Name of graphics card
     */
    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }//end setGraphicsCard

    /**
     * Method that returns the amount of RAM
     * @return int - Amount of RAM in GB
     */
    public int getRandomAccessMemory() {
        return randomAccessMemory;
    }//end getRandomAccessMemory

    /**
     * Method that changes the amount of RAM
     * @param randomAccessMemory int - Amount of RAM in GB
     */
    public void setRandomAccessMemory(int randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }//end setRandomAccessMemory

    /**
     * Method that returns the amount of storage
     * @return int - Amount of storage in GB
     */
    public int getStorage() {
        return storage;
    }//end getStorage

    /**
     * Method that changes the amount of storage
     * @param storage int - Amount of storage in GB
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }//end setStorage

    /**
     * Override method that specifically describes the aspects of the computer
     * @return String - Description of computer
     */
    @Override
    public String toString() {
        String description = "The " + this.getManufacturingCompany().name() + " ";
        description += this.getName() + " has a ";
        description += this.getProcessor() + ", a ";
        description += this.getGraphicsCard() + ", ";
        description += this.getStorage() + " GB of storage, and ";
        description += this.getRandomAccessMemory() + " GB of RAM.";
        return description;
    }//end toString

    /**
     * Override method that returns if two computers have the same name and manufacturing company
     * @param obj - Computer that is being compared to
     * @return boolean - If the name and manufacturing company are equal
     */
    @Override
    public boolean equals(Object obj) {
         GamingComputer gc2 = (GamingComputer)obj;
         return (this.getName().equals(gc2.getName()) && this.getManufacturingCompany().name().equals(gc2.getManufacturingCompany().name()));
    }//ends equals

}// end GmaingComputer class
