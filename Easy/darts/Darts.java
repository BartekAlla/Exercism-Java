class Darts {
    public static int pointDependingOnCircle(double xOfDart, double yOfDart) {
        return inTheInner(xOfDart, yOfDart) ? 10 : inTheMiddle(xOfDart, yOfDart) ? 5 : inTheOuter(xOfDart, yOfDart) ? 1 : 0;
    }

    private static boolean inTheOuter(double xOfDart, double yOfDart) {
        double pointToCheck = Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2);
        return Math.pow(5, 2) < pointToCheck && pointToCheck <= Math.pow(10, 2);
    }

    private static boolean inTheMiddle(double xOfDart, double yOfDart) {
        double pointToCheck = Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2);
        return Math.pow(1, 2) < pointToCheck && pointToCheck <= Math.pow(5, 2);
    }

    private static boolean inTheInner(double xOfDart, double yOfDart) {
        return Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2) <= Math.pow(1, 2);
    }

    int score(double xOfDart, double yOfDart) {
        return pointDependingOnCircle(xOfDart, yOfDart);
    }
}
