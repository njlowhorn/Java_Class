package gamingcomputerbuild;

public class GamingComputerBuild {

    public static void main(String[] args) {
        GamingComputer gc1 = new GamingComputer("Aurora", ManufacturingCompany.Alienware);
        gc1.setProcessor("AMD Ryzen 5");
        gc1.setGraphicsCard("NVIDIA GeForce RTX 3050");
        gc1.setStorage(256);
        gc1.setRandomAccessMemory(16);
        System.out.println(gc1);
        
        Desktop d1= new Desktop("Pavilion", ManufacturingCompany.HP, true);
        d1.setProcessor("AMD Ryzen 7");
        d1.setGraphicsCard("NVIDIA GeForce RTX 3060");
        d1.setRandomAccessMemory(8);
        d1.setStorage(512);
        System.out.println(d1);
        
        Laptop L1 = new Laptop("12th Gen Intel Core i5-12500H", "NVIDIA GeForce RTX 3050", 16, 512, 4);
        L1.setName("x14");
        L1.setManufacturingCompany(ManufacturingCompany.Alienware);
        System.out.println(L1);
    }//end main
    
}//end GamingComputerBuildClass
