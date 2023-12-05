public class SalaryCalculator {
    private static final int VALUE_PER_ITEM = 221;
    private static final double BASE_SALARY = 1000.0;
    private static final double MAX_SALARY = 2000.0;
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
       return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = BASE_SALARY * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return finalSalary > 2000 ? MAX_SALARY : finalSalary;
    } 
}
