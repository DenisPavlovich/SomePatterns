package domain;

/**
 * Created by DenisPavlovich on 14.09.2016.
 */
public class Battery {
    private final String capasity;
    private final String manufacture;

    public Battery(String capasity, String manufacture) {
        this.capasity = capasity;
        this.manufacture = manufacture;
    }

    //getters
    public String getCapasity() {
        return capasity;
    }

    public String getManufacture() {
        return manufacture;
    }
}
