package Observer;

import java.util.ArrayList;
import java.util.List;

// subject class

public class SmartHome {

    int energyConsumption;

    int wlanPower = 25;
    int ligthsPower = 25;
    int heatingPower = 25;

    private List<Observer> observers = new ArrayList<Observer>();
    private int state; // 1 fullpower , 2 energysaver

    public SmartHome(){
        this.energyConsumption = this.wlanPower + this.ligthsPower + this.heatingPower;
    }


    public void notifyObservers(String setter){
        for(Observer observer: this.observers){
            observer.update(setter);
        }
    }

    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }


    public int getState(){
        return this.state;
    }

    public int getEnergyConsumption() {
        return this.wlanPower + this.ligthsPower + this.heatingPower;
    }

    public int getWlanPower() {
        return wlanPower;
    }

    public void setWlanPower(int wlanPower) {
        this.wlanPower = wlanPower;
        this.notifyObservers("wlan");

    }

    public int getLigthsPower() {
        return ligthsPower;
    }

    public void setLigthsPower(int ligthsPower) {
        this.ligthsPower = ligthsPower;
        this.notifyObservers("lights");
    }

    public int getHeatingPower() {
        return heatingPower;
    }

    public void setHeatingPower(int heatingPower) {
        this.heatingPower = heatingPower;
        this.notifyObservers("heat");
    }

    @Override
    public String toString() {
        return "SmartHome{" +
                "energyConsumption=" + energyConsumption +
                ", wlanPower=" + wlanPower +
                ", ligthsPower=" + ligthsPower +
                ", heatingPower=" + heatingPower +
                ", observers=" + observers +
                ", state=" + state +
                '}';
    }
}

