public class CarsAssemble {
    private static final int CARS_PRODUCED_EACH_HOUR = 221;
    public double speedAccuracy(int speed) {
        return switch (speed) {
            case 1, 2, 3, 4 -> 1;
            case 5, 6, 7, 8 -> 0.9;
            case 9 -> 0.8;
            case 10 -> 0.77;
            default -> 0.0;
        };
    }
    public double productionRatePerHour(int speed) {
        return speed * CARS_PRODUCED_EACH_HOUR  * speedAccuracy(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
