package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_6;

class SalesAnalyser {

    public double calculateZeroUnitSold (Sale[] unitSold) {
        if (unitSold.length == 0) return 0.0;
        return 0;
    }

    public Sale calculateMaxUnitSold(Sale [] BestUnitCount) {
        int maxUnitSold = 0;
          Sale unitSold = BestUnitCount [0];
           for (int i = 0; i < BestUnitCount.length; i++) {
               int unitCount = BestUnitCount[i].getUnitCount();
               if (unitCount > maxUnitSold) {
                    maxUnitSold = unitCount;
                    unitSold = BestUnitCount[i];
                }
            } return unitSold;
        }
    public Sale calculateMaxMoney(Sale [] PriceUnit) {
        double maxUnitSale = PriceUnit[0].getUnitCount() * PriceUnit[0].getPricePerUnit();;
        Sale sale = PriceUnit[0];
        for (int i = 0; i<PriceUnit.length; i++) {
            double maxSale = PriceUnit[i].getUnitCount() * PriceUnit[i].getPricePerUnit();
            if (maxSale > maxUnitSale) {
                maxUnitSale = maxSale;
                sale = PriceUnit[i];
            }
        }
        return sale;
    }
}




