class NeedForSpeed {
    private int speed;
    private int batteryDrain;
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

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
    public int getBatterySpeed() {
        return this.speed;
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained() && this.distance > 0) {
            car.drive();
            distance -= car.getBatterySpeed();
        }
        return !car.batteryDrained() && this.distance == 0;

    }
}
