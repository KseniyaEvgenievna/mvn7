package ru.netology.stats;

public class StatsService {

    public long minSum(long[] sales) { //min сумма продаж
        int minSum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minSum]) {
                minSum = i;
            }
        }
        return minSum + 1;
    }

    public long maxSum(long[] sales) {
        int maxSum = 0; //max сумма продаж
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxSum]) {
                maxSum = i;
            }
        }
        return maxSum + 1;
    }

    public long Sum(long[] sales) { //сумма всех продаж
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long belowAverage(long[] sales) { //количество месяцев, в которых продажи были ниже среднего
        long belowAverage = averageAmount(sales);
        long month = 0;
        for (long number : sales) {
            if (number < averageAmount(sales)) {
                month = month + 1;

            }
        }
        return month;
    }

    public long aboveAverage(long[] sales) { //количество месяцев, в которых продажи были выше среднего
        long aboveAverage = averageAmount(sales);
        long month = 0;
        for (long number : sales) {
            if (number > averageAmount(sales)) {
                month = month + 1;

            }
        }
        return month;
    }


    public long averageAmount(long[] sales) { //средняя сумма продаж в месяц
        long sum = Sum(sales);
        return sum / sales.length;
    }
}