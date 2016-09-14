package domain;

import com.oracle.webservices.internal.api.databinding.Databinding;

/**
 * Created by DenisPavlovich on 14.09.2016.
 */
public class SolarPanels {
    private TypeSolarPanel type;
    private String manufacturer;
    private Double lenght;
    private Double width;
    private Controller controller;

    public static enum TypeSolarPanel {
        monocrystalline,
        polycrystalline
    }

    private SolarPanels(){}

    //getters
    public TypeSolarPanel getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Double getLenght() {
        return lenght;
    }

    public Double getWidth() {
        return width;
    }

    public Controller getController(){ return controller; }

    //methods
    public static SolarPanelsBuilder newSolarPanelsBuilder() {
        return new SolarPanels().new SolarPanelsBuilder();
    }

    //builder
    public class SolarPanelsBuilder {
        private SolarPanelsBuilder(){

        }

        //setters for final fields
        public SolarPanelsBuilder setType(TypeSolarPanel type) {
            SolarPanels.this.type = type;
            return this;
        }

        public SolarPanelsBuilder setManufacturer(String manufacturer) {
            SolarPanels.this.manufacturer = manufacturer;
            return this;
        }

        public SolarPanelsBuilder setLenght(Double lenght) {
            SolarPanels.this.lenght = lenght;
            return this;
        }

        public SolarPanelsBuilder setWidth(Double width) {
            SolarPanels.this.width = width;
            return this;
        }

        public SolarPanelsBuilder setController(Controller controller) {
            SolarPanels.this.controller = controller;
            return this;
        }

        public SolarPanels build(){
            return SolarPanels.this;
        }
    }

}
