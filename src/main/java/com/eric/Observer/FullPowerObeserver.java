package Observer;

import Observer.Observer;

public class FullPowerObeserver extends Observer {

    public FullPowerObeserver(SmartHome smartHome){
        this.smartHome = smartHome;
        this.smartHome.registerObserver(this);
    }

    @Override
    public void update(String setter) {
        int all = this.smartHome.getEnergyConsumption();
        int distribute = (int) (100 - all)/2;
        if(setter != "heat") this.smartHome.heatingPower = this.smartHome.heatingPower+distribute;
        if(setter != "wlan") this.smartHome.wlanPower = this.smartHome.wlanPower+distribute;
        if(setter != "lights") this.smartHome.ligthsPower = this.smartHome.ligthsPower+distribute;
        this.smartHome.energyConsumption = this.smartHome.getEnergyConsumption();
    }
}
