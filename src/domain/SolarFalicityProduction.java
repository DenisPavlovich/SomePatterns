package domain;

/**
 * Created by DenisPavlovich on 15.09.2016.
 */
public abstract class SolarFalicityProduction {
    public abstract SolarPanels create();

    public void work() {
        System.out.print("Work!");
    }

}

class SolarFacilityMonocrystalline extends SolarFalicityProduction{
    @Override
    public SolarPanels create() {
        Controller controller = Controller.newControllerBuilder().set_CPU("350C").setRegisters("120GG").setBattery("3500mah","ProductiongTM11").setManufacturer("ProductionTM1").build();
        SolarPanels solarPanels = SolarPanels.newSolarPanelsBuilder().setLenght(500D).setWidth(850D).setManufacturer("Sony").setType(SolarPanels.TypeSolarPanel.monocrystalline).setController(controller).build();
        return solarPanels;
    }
}

class SolarFacilityPolycrystalline extends SolarFalicityProduction {
    @Override
    public SolarPanels create() {
        Controller controller = Controller.newControllerBuilder().set_CPU("X128X").setRegisters("32FF").setBattery("950mah", "TM555TM").setManufacturer("ProductionTM1").build();
        SolarPanels solarPanels = SolarPanels.newSolarPanelsBuilder().setLenght(250D).setWidth(425D).setManufacturer("SIEMENS").setType(SolarPanels.TypeSolarPanel.polycrystalline).setController(controller).build();
        return solarPanels;
    }
}
