package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_6;

public class SaleAnalyserTest {
    public static void main(String[] args) {
        SaleAnalyserTest test = new SaleAnalyserTest();
        test.testZeroProductCount();
        test.testBestProductCountSale();
        test.testBestProductMoneyEarned();
    }

    void testZeroProductCount () {
        SalesAnalyser salesAnalyser = new SalesAnalyser();
        Sale [] product = new Sale[]{new Sale("Old Jacket", 0, 0)};
        double zeroProduct = salesAnalyser.calculateZeroUnitSold(product);
        checkResultNull(zeroProduct, 0, "Out of Stock: ");
    }
    void testBestProductCountSale () {
        SalesAnalyser salesAnalyser = new SalesAnalyser();
        Sale [] products = {
                new Sale("Jacket", 40.0, 2),
                new Sale("Jeans", 30.0, 4),
                new Sale("T-Shirt", 5.0, 10),
                new Sale("Shirt", 10.0, 7),
                new Sale("Scarf", 8.0, 11)
        };
        Sale testProduct = salesAnalyser.calculateMaxUnitSold(products);
        String Result = testProduct.getProduct();
        checkResult(Result,"Scarf", "Best Product Count Sale is Scarf");
    }
    void testBestProductMoneyEarned () {
        SalesAnalyser salesAnalyser = new SalesAnalyser();
        Sale [] products = {
                new Sale("Jacket", 40.0, 2),
                new Sale("Jeans", 30.0, 4),
                new Sale("T-Shirt", 5.0, 10),
                new Sale("Shirt", 10.0, 7),
                new Sale("Scarf", 8.0, 11)
        };
        Sale testProduct = salesAnalyser.calculateMaxMoney(products);
        String Result = testProduct.getProduct();
        checkResult(Result, "Jeans", "Best Product Money Sale is Jeans");
    }

    private void checkResultNull(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

    private void checkResult(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }


}


