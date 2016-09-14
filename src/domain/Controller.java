package domain;

/**
 * Created by DenisPavlovich on 14.09.2016.
 */
public class Controller {
    private String manufacturer;
    private String _CPU;
    private String registers;
    private Battery battery;

    public Controller(){}

    //getters
    public String getManufacturer() {
        return manufacturer;
    }

    public String getCPU() {
        return _CPU;
    }

    public String getRegisters() {
        return registers;
    }

    //methods
    public static ControllerBuilder newControllerBuilder(){
        return new Controller().new ControllerBuilder();
    }

    //builder
    public class ControllerBuilder{
        private ControllerBuilder(){}

        //setters
        public ControllerBuilder setManufacturer(String manufacturer) {
            Controller.this.manufacturer = manufacturer;
            return this;
        }

        public ControllerBuilder set_CPU(String _CPU) {
            Controller.this._CPU = _CPU;
            return this;
        }

        public ControllerBuilder setRegisters(String registers) {
            Controller.this.registers = registers;
            return this;
        }

        public ControllerBuilder setBattery(Battery battery) {
            Controller.this.battery = battery;
            return this;
        }

        public ControllerBuilder setBattery(String batteryCapacity, String batteryManufacturer) {
            Controller.this.battery = new Battery(batteryCapacity,batteryManufacturer);
            return this;
        }

        public Controller build(){
            return Controller.this;
        }

    }
}