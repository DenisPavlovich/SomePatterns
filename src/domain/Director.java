package domain;

import domain.SolarPanels.*;

import java.nio.Buffer;

import static domain.SolarPanels.TypeSolarPanel.*;

/**
 * Created by DenisPavlovich on 15.09.2016.
 */
public class Director {
    private SolarFalicityProduction solarFalicityProduction;
    public SolarPanels[] run (int count, TypeSolarPanel type){
        SolarPanels[] arr = new SolarPanels[count];
        StringBuffer buf = new StringBuffer();
        switch (type){
            case monocrystalline:
                for (int i = 0; i < count; i++) {
                    arr[i] = solarFalicityProduction.create();
                    System.out.println("monocrystalline is created " + i+1);
                }
                return arr;
            case polycrystalline:
                for (int i = 0; i < count; i++) {
                    arr[i] = solarFalicityProduction.create();
                    System.out.println("monocrystalline is created " + i+1);
                }
                return arr;
            default:
                throw new IllegalArgumentException();
        }
    }
}
