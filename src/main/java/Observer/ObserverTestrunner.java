package Observer;

public class ObserverTestrunner {
    public static void main(String args[]){
        SmartHome myHome = new SmartHome();

        new FullPowerObeserver(myHome);
        System.out.println(myHome);

        myHome.setLigthsPower(35);
        System.out.println(myHome);

        myHome.setHeatingPower(55);
        System.out.println(myHome);

    }
}
