package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_6;

class Sale {

    private String product;
    private double pricePerUnit;
    private int unitCount;

    public Sale(String product, double pricePerUnit, int unitCount) {
        this.product = product;
        this.pricePerUnit = pricePerUnit;
        this.unitCount = unitCount;
    }

    public String getProduct() {
        return product;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getUnitCount() {
        return unitCount;
    }
}