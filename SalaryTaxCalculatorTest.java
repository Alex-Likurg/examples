package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_6;

public class SalaryTaxCalculatorTest {

    // int 5000 result 1500
    // int 20000 result 7000
    // int 60000 result 24000
    // int -200 result 0
    public static void main(String[] args) {

        SalaryTaxCalculatorTest newSalary = new SalaryTaxCalculatorTest();
        newSalary.test1();
        newSalary.test2();
        newSalary.test3();
        newSalary.test4();

    }

    public void test1() {
        SalaryTaxCalculator salaryTest = new SalaryTaxCalculator();
        double result = salaryTest.calculate2(5000);
        checkResult(result, 1500, "Tax of your salary under 10000: ");

    }
    public void test2() {
        SalaryTaxCalculator salaryTest2 = new SalaryTaxCalculator();
        double result = salaryTest2.calculate3(20000);
        checkResult(result, 7000, "Tax of your salary between 10000 and 50000: ");
    }
    public void test3() {
        SalaryTaxCalculator salaryTest3 = new SalaryTaxCalculator();
        double result = salaryTest3.calculate4(60000);
        checkResult(result, 24000, "Tax of your salary more than 50000: ");
    }

    public void test4() {
        SalaryTaxCalculator salaryTest4 = new SalaryTaxCalculator();
        double result = salaryTest4.calculate1(-200);
        checkResult(result, 0, "Tax of your salary less than 0: ");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
