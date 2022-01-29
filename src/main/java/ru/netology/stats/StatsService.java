package ru.netology.stats;

public class StatsService {
    //1
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    //2
    public long average(long[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }

    //3
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //4
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //5
    public int averageMin(long[] purchases) {
       int i = 0;
        for (long purchase : purchases) {
            if (purchase < average(purchases)) {
                i = i + 1;
            }
        }

        return i;
    }

    //6
    public int averageMax(long[] purchases) {
        int i = 0;
        for (long purchase : purchases) {
            if (purchase > average(purchases)) {
                i = i + 1;
            }
        }

        return i;
    }

}