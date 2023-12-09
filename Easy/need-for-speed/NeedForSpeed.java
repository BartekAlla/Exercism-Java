class NeedForSpeed {
    private int speed;
    private final int batteryDrain;
    private int distanceDriven;
    private int batteryPercentage;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        batteryPercentage = 100;
    }

    public boolean batteryDrained() {
        return this.batteryPercentage == 0 || this.batteryPercentage < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (this.batteryPercentage >= this.batteryDrain) {
            this.distanceDriven += this.speed;
            this.batteryPercentage -= this.batteryDrain;
        }
    }
    public int getSpeed() {
        return this.speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
    public int getBatteryDrain() {
        return this.batteryDrain;
    }
}

class RaceTrack {
    private final int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
       return   (double) this.distance / car.getSpeed() <=  100 / (double) car.getBatteryDrain();
    }
}
