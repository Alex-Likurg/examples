package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_7;

import lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_5.SalaryAnalyserTest;

public class StockAnalyzerTest {

    public static void main(String[] args) {

        StockAnalyzerTest test = new StockAnalyzerTest();
        test.returnZeroAssetValue();
        test.returnAssetValue();
        test.returnZeroReturnInPercentAverage();
        test.returnReturnInPercentAverage();
    }

    public void returnZeroAssetValue() {
        StockAnalyzer zeroAssetValue = new StockAnalyzer();
        Stock [] stock = new Stock[]{new Stock("No Stock",0,0)};
        double zeroStock = zeroAssetValue.calculateStockAssetValueSumm(stock);
        checkResult(zeroStock,0,"There are no stock.");
    }
    public void returnAssetValue() {
        StockAnalyzer assetValue = new StockAnalyzer();
        Stock [] stocks = {
                new Stock("Gazprom", 200, 5),
                new Stock("Rosatom", 150,3),
                new Stock("Sberbank", 210,3),
                new Stock("Vk Media", 100, 1.5),
                new Stock("Magnit", 120, 7)
        };

        double testSumm = assetValue.calculateStockAssetValueSumm(stocks);
        checkResult(testSumm,780,"Asset Value is " + testSumm + ". ");

    }
    public void returnZeroReturnInPercentAverage() {
        StockAnalyzer zeroReturninPercent = new StockAnalyzer();
        Stock [] stock = new Stock[]{new Stock("No Stock",0,0)};
        double zeroStock = zeroReturninPercent.calculateStockAssetValueSumm(stock);
        checkResult(zeroStock,0,"There are no stock.");
    }
    public void returnReturnInPercentAverage() {
        StockAnalyzer returnInPercent = new StockAnalyzer();
        Stock [] stocks = {
                new Stock("Gazprom", 200, 5),
                new Stock("Rosatom", 150,3),
                new Stock("Sberbank", 210,3),
                new Stock("Vk Media", 100, 1.5),
                new Stock("Magnit", 120, 7)
        };

        double testReturnAverage = returnInPercent.calculateStockReturnInPercentAverage(stocks);
        checkResult(testReturnAverage,3.9,"Average return in percent is " + testReturnAverage + ". ");
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
