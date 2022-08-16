package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void PositiveFromZeroToOneHundredTest() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calculate(0, 100);

        Assertions.assertEquals(expected, actual);
    }
        @Test
        public void PositiveBetweenOneHundredAndTwoHundred() {
            SQRService service = new SQRService();
            int expected = 5;
            int actual = service.calculate(100, 200);

            Assertions.assertEquals(expected, actual);
        }
        @Test
    public void NegativeBetweenTwoHundredAndThreeHundred(){
            SQRService service = new SQRService();
            int expected = 0;
            int actual = service.calculate(-200, -300);

            Assertions.assertEquals(expected,actual);
        }
    }

