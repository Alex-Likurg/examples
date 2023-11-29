package lv.javaguru.java1.student_alexey_kosmachev.lesson_7.homework.day_5;


class SalaryAnalyser {

    public double calculateSalarySum(double[] allSalary) {
        double SalarySum = 0.0;
        for (int i = 0; i < allSalary.length; i++) {
            SalarySum += allSalary[i];
        }
        return SalarySum;
    }

    public double calculateMinSalary(double[] allSalary) {
        if (allSalary.length == 0) {
            return 0.0;
        } else {
            double minSalary = allSalary[0];
            for (int i = 0; i < allSalary.length; i++) {
                if (minSalary > allSalary[i]) {
                    minSalary = allSalary[i];
                }
            }
            return minSalary;
        }
    }

    public double calculateMaxSalary(double[] allSalary) {
        if (allSalary.length == 0) {
            return 0.0;
        } else {
            double maxSalary = allSalary[0];
            for (int i = 0; i < allSalary.length; i++) {
                if (maxSalary < allSalary[i]) {
                    maxSalary = allSalary[i];
                }
            }
            return maxSalary;
        }
    }

    public double calculateAverageSalary(double[] allSalary) {
        double totalSalary = calculateSalarySum(allSalary);
        if (allSalary.length == 0) {
            return 0.0;
        } else {
            return totalSalary / allSalary.length;
        }
    }

    public double calculateSigmafromAverage(double[] allSalary){
        double averageSalary = calculateAverageSalary(allSalary);
        double sigmaAverage = 0;
        double averageDeviation = 0;
        for (int i = 0; i < allSalary.length; i++){
            averageDeviation += Math.pow((allSalary[i] - averageSalary),2);
            sigmaAverage = Math.sqrt(averageDeviation/allSalary.length);
        }
        return sigmaAverage;
    }

}
