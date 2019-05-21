package Observer;

public class AdjustEnergyObserver extends Observer {

    public AdjustEnergyObserver(SmartHome smartHome){
        this.smartHome = smartHome;
        this.smartHome.registerObserver(this);
    }
    @Override
    public void update(String setter) {

    }
}
