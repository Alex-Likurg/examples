package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_5;


public class SalaryAnalyserTest {

    public static void main(String[] args) {
        SalaryAnalyserTest test = new SalaryAnalyserTest();
        test.ReturnZeroSalarySum();
        test.ReturnSalarySum();
        test.ReturnZeroMinSalary();
        test.ReturnMinSalary();
        test.ReturnZeroMaxSalary();
        test.ReturnMaxSalary();
        test.ReturnZeroAverageSalary();
        test.ReturnAverageSalary();
        test.ReturnSigmaAverage();
    }

    public void ReturnZeroSalarySum() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] allSalary = {};
        double totalSalaryExpenses = salaryAnalyser.calculateSalarySum(allSalary);
        checkResult(totalSalaryExpenses, 0.0, "No Salary");
    }

    public void ReturnSalarySum() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] allSalary = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double totalSalaryExpenses = salaryAnalyser.calculateSalarySum(allSalary);
        checkResult(totalSalaryExpenses, 14400.0, "Overall Salary expenses " + totalSalaryExpenses);
    }

    public void ReturnZeroMinSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] allSalary = {};
        double minSalary = salaryAnalyser.calculateMinSalary(allSalary);
        checkResult(minSalary, 0.0, "No min Salary");
    }

    public void ReturnMinSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] allSalary = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double minSalary = salaryAnalyser.calculateMinSalary(allSalary);
        checkResult(minSalary, 1800.0, "Min Salary is " + minSalary);
    }

    public void ReturnZeroMaxSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] allSalary = {};
        double maxSalary = salaryAnalyser.calculateMaxSalary(allSalary);
        checkResult(maxSalary, 0.0, "No max Salary");
    }

    public void ReturnMaxSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] allSalary = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double maxSalary = salaryAnalyser.calculateMaxSalary(allSalary);
        checkResult(maxSalary, 4000.0, "Max Salary is " + maxSalary);
    }

    public void ReturnZeroAverageSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] allSalary = {};
        double averageSalary = salaryAnalyser.calculateAverageSalary(allSalary);
        checkResult(averageSalary, 0.0, "No average Salary");
    }

    public void ReturnAverageSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] allSalary = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double averageSalary = salaryAnalyser.calculateAverageSalary(allSalary);
        checkResult(averageSalary, 2880.0, "Average Salary is " + averageSalary);
    }

    public void ReturnSigmaAverage() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] allSalary = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double sigmaAverage = salaryAnalyser.calculateSigmafromAverage(allSalary);
        checkResult(sigmaAverage,Math.sqrt(533600),"Sigma for Salary is " + sigmaAverage);
    }



    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
