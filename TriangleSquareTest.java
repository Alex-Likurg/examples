package lv.javaguru.java1.student_alexey_kosmachev.lesson_6.homework.day_1;


class TriangleSquareTest {

    // a = 10, b = 15, c = 13
    // Math.sqrt(s * (s - a) * (s - b) * (s - c)) , result = квадратный корень(math.sqrt) из 4104
    // (a + b + c) / (double) 2 , result = 19
    // 19*4*9*6

    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.test1();
        test.test2();
    }

    public void test1 () {
        int a = 10; // input
        int b= 15;
        int c = 13;
        TriangleSquare perimeter = new TriangleSquare();
        double result = perimeter.calculateSemiPerimeter(10,15,13);
        checkResult(result, 19, "test1");

    }
    public void test2 () {
        int a = 10; // input
        int b = 15;
        int c = 13;
        TriangleSquare square = new TriangleSquare();
        double result = square.calculateSquare(10, 15, 13);
        checkResult(result, Math.sqrt(4104), "test2");
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
