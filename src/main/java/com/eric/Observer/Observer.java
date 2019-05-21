package Observer;

public abstract class Observer {
    SmartHome smartHome;
    public abstract void update(String setter);
}
