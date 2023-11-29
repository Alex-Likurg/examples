package lv.javaguru.java1.student_alexey_kosmachev.lesson_4.homework.day_4;

class Stock {

    String nameorg;   // название организации
    double price; // текущая цена
    double minprice; // минимальная цена за отчетный период
    double maxprice; // максимальная цена за отчетный период

    Stock(String nameorg, double price, double minprice, double maxprice) { // конструктор компании и цен
        this.nameorg = nameorg;
        this.price = price;
        this.minprice = minprice;
        this.maxprice = maxprice;
    }
void updatePrice(double price) { // уравнение новых значений цен
        this.price = price;
        if (price <= minprice || minprice == 0) { this.minprice = price;}
        if (price >= maxprice) { this.maxprice = price;}
}

String getPriceInformation() // уравнение получения информации
    { return ("Organization Name: " + nameorg) + (" , Goods Price: " + price ) + (" , Goods MinPrice: " + minprice ) + (" , Goods MaxPrice: " + maxprice ); }

}
