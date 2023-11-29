package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_7;

public class CompoundInterestCalculatorTest {
// summ 1000     result 1000*math.pow 1.012, 10
// interest 1.2
// term 10

// summ 2225.23  result 2225.23*math.pow 1.028, 2.5
// interest 2.8
// term 2.5

    public static void main(String[] args) {

        CompoundInterestCalculatorTest newInterest = new CompoundInterestCalculatorTest();
        newInterest.test1();
        newInterest.test2();
    }

    public void test1() {
        CompoundInterestCalculator newtest = new CompoundInterestCalculator();
        double result = newtest.CompoundInterest(1000, 1.2,10);
        checkResult(result, 1000 * Math.pow(1.012,10), "Compound Interest Test even summ result: ");
    }

    public void test2() {
        CompoundInterestCalculator newtest = new CompoundInterestCalculator();
        double result = newtest.CompoundInterest(2225.23, 2.8,2.5);
        checkResult(result, 2225.23 * Math.pow(1.028,2.5), "Compound Interest Test odd summ result: ");
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
