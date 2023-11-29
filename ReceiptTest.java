package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_4;


class ReceiptTest {

    public static void main(String[] args) {
        ReceiptTest test = new ReceiptTest();
        test.ReturnZeroSum();
        test.ReturnTotalReceiptSum();
        test.ReturnZeroAverage();
        test.ReturnAverageReceipt();
    }

    public void ReturnZeroSum() {
        CashReceipt[] receipts = {};
        ReceiptCalculator calculator = new ReceiptCalculator();
        double totalSum = calculator.calculateTotalSalesSum(receipts);
        checkResult(totalSum, 0.0, "Return Zero Sum.");
    }

    public void ReturnTotalReceiptSum() {
        CashReceipt[] receipts = {
                new CashReceipt(1, 1.0),
                new CashReceipt(1, 2.5),
        };
        ReceiptCalculator calculator = new ReceiptCalculator();
        double totalSum = calculator.calculateTotalSalesSum(receipts);
        checkResult(totalSum, 3.5, "Return Total Receipt Sum.");
    }

    public void ReturnZeroAverage() {
        CashReceipt[] receipts = {};
        ReceiptCalculator calculator = new ReceiptCalculator();
        double averageReceiptSum = calculator.calculateAverageReceiptSum(receipts);
        checkResult(averageReceiptSum, 0.0, "Return Zero Average.");
    }

    public void ReturnAverageReceipt() {
        CashReceipt[] receipts = {
                new CashReceipt(1, 1.0),
                new CashReceipt(1, 3.0),
        };
        ReceiptCalculator calculator = new ReceiptCalculator();
        double averageReceiptSum = calculator.calculateAverageReceiptSum(receipts);
        checkResult(averageReceiptSum, 2.0, "Return Average Receipt Sum.");
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
