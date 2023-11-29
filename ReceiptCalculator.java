package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_4;


class ReceiptCalculator {

    public double calculateTotalSalesSum(CashReceipt[] receipts) {
        double totalSum = 0.0;
        for (int i = 0; i < receipts.length; i++) {
            CashReceipt receipt = receipts[i];
            totalSum += receipt.getCashReceiptSumm();
        }
        return totalSum;
    }

    public double calculateAverageReceiptSum(CashReceipt[] receipts) {
        if (receipts.length == 0) {return 0.0;}
        else {double ReceiptSum = 0.0; double totalSum = 0.0;
        for (int i = 0; i < receipts.length; i++) {
            CashReceipt receipt = receipts[i];
            ReceiptSum += receipt.getCashReceiptNumber();
            totalSum += receipt.getCashReceiptSumm();
        }
        return totalSum/ReceiptSum;}

    }

}
