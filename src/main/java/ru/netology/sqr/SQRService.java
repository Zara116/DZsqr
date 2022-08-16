package ru.netology.sqr;

public class SQRService {

    public int calculate(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i < min) {
                continue;
            }

            if (i * i > max) {
                break;
            }
            count++;
        }

        return count;
    }
}



