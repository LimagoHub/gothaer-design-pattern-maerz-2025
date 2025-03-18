package trafficlight;

public class TrafficLight {

    final TrafficLightState red = new RedState(this) ;
    final TrafficLightState green = new GreenState(this) ;
    final TrafficLightState off = new OffState(this) ;
    TrafficLightState current = off;

    public String getColor() {
        return current.getColor();
    }

    public void nextColor() {
        current.nextColor();
    }

    public void switchOn() {
        current.switchOn();
    }

    public void switchOff() {
        current.switchOff();
    }
}
