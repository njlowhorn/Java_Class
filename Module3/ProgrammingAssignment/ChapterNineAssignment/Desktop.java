package gamingcomputerbuild;

/**
 * A child class about desktop computers
 * @author Nolan Lowhorn
 */
public class Desktop extends GamingComputer{
    private boolean comesWithMonitor;

    /**
     * Default constructor
     */
    public Desktop() {
    }//ends Destop empty constructor

    /**
     * Constructor for the basic information of the desktop computer
     * @param name String - Official title of the computer
     * @param manufacturingCompany ManufacturingCompany - Manufacturer that made the computer
     * @param comesWithMonitor boolean - If the desktop computer comes with a monitor
     */
    public Desktop(String name, ManufacturingCompany manufacturingCompany, boolean comesWithMonitor) {
        super(name, manufacturingCompany);
        this.comesWithMonitor = comesWithMonitor;
    }//ends Destop constructor

    /**
     * Method that returns if the desktop comes with a monitor
     * @return boolean - If the desktop comes with a monitor
     */
    public boolean isComesWithMonitor() {
        return comesWithMonitor;
    }//ends isComesWithMonitor

    /**
     * Method that changes if the desktop comes with a monitor
     * @param comesWithMonitor boolean - If the desktop comes with a monitor
     */
    public void setComesWithMonitor(boolean comesWithMonitor) {
        this.comesWithMonitor = comesWithMonitor;
    }//ends setComesWithMonitor

    /**
     * Override method that returns description of desktop computer and if it has a monitor
     * @return String - Description of desktop computer
     */
    @Override
    public String toString() {
        String description = super.toString();
        if(this.comesWithMonitor){
            description += " Plus, it comes with a monitor.";
            return description;
        }//ends if
        else{
            return description;
        }//ends else
    }//ends toString

    
    
    
}//ends Desktop class
