package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_7;



public class StockAnalyzer {


    public double calculateStockAssetValueSumm(Stock[] stockAssetValue) {
        double assetValueSumm = 0;
        for (int i = 0; i < stockAssetValue.length; i++) {
            assetValueSumm += stockAssetValue[i].getAssetValue();
        }
        return assetValueSumm;
    }
    public double calculateStockReturnInPercentAverage(Stock[] stockReturnInPercent) {
        double returnIPercentSumm = 0;
        for (int i = 0; i < stockReturnInPercent.length; i++) {
            returnIPercentSumm += stockReturnInPercent[i].getReturnInPercents();
        }

        return returnIPercentSumm/stockReturnInPercent.length;
    }

}
