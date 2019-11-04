package Lab4;

public class MonitorImpl implements Monitor {
    boolean[] turnOn = {false, false};
    int whoIsOn = 0;

    @Override
    public void proceduraWejsciowaWatek1() {
        turnOn[0] = true;
        whoIsOn = 1;
        while (turnOn[1] == true && whoIsOn == 1) {
            //uśpić ten wątek jakoś na ten czas
        }
    }

    @Override
    public void proceduraWejsciowaWatek2() {
        turnOn[1] = true;
        whoIsOn = 0;
        while (turnOn[0] == true && whoIsOn == 0) {
            //zostawiamy
        }
    }

    @Override
    public void proceduraWyjsciowaWatek1() {
        turnOn[0] = false;
    }

    @Override
    public void proceduraWyjsciowaWatek2() {
        turnOn[1] = false;
    }
}
