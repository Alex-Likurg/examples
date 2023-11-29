package lv.javaguru.java1.student_alexey_kosmachev.lesson_4.homework.day_4;

class StockTest {
    public static void main(String[] args) { //изначальные переменные
        Stock burgerking = new Stock("Burger King", 5.25, 0,0);
        String information = burgerking.getPriceInformation();
        System.out.println("Name of organization and its prices for a month: " + "\n" + information);

        burgerking.updatePrice(10); // вводим новые переменные
        burgerking.updatePrice(12);
        burgerking.updatePrice(5);
        burgerking.updatePrice(7);
        burgerking.updatePrice(99);
        burgerking.updatePrice(77);

        System.out.println();

        String newinformation = burgerking.getPriceInformation();
        System.out.println("Last information update: " + "\n" + newinformation);  //обновленный результат

    }
}
