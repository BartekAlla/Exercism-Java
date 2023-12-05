public class ElonsToyCar {
    private long distanceDriven;
    private int batteryPercentage = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven "+ this.distanceDriven +" meters";
    }

    public String batteryDisplay() {
        if (this.batteryPercentage > 0){
            return "Battery at " + this.batteryPercentage + "%";
        } else {
            return "Battery empty";
        }

    }

    public void drive() {
        if (this.batteryPercentage > 0) {
            this.distanceDriven += 20;
            this.batteryPercentage -= 1;
        }

    }
}
