package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {
    @Test
    public void testCalculateRestMonth1() {

        // AAA
        // Arrange - подготовка к тесту
        FreelancerService service = new FreelancerService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

         // Act - шаги теста
        int actual = service.calculate(income, expenses, threshold);

        // Assert - проверки данных
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateRestMonth2() {

        // AAA
        // Arrange - подготовка к тесту
        FreelancerService service = new FreelancerService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        // Act - шаги теста
        int actual = service.calculate(income, expenses, threshold);

        // Assert - проверки данных
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

}