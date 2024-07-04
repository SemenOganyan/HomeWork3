package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driner", "C:\\Tools\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        // Принимаю файлы куки (не авторизованный аккаунт заставляют при каждом заходе проверять)
        try {
            WebElement input = driver.findElement(By.xpath("//button[text()='Принять']"));
            input.click();
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент не найден");
        };

        // Проверка названия указанного блока (выбрал "Хиты продаж")
        try {
            WebElement blockTitle = driver.findElement(By.xpath("//*[text() = 'Хиты продаж']"));
            if (blockTitle.isDisplayed()) {
                System.out.println("Название блока найдено: " + blockTitle.getText());
            } else {
                System.out.println("Название блока не найдено");
            }
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент не найден");
        };

        // Проверка наличия блока с логотипами платежных систем
        try {
            WebElement logos = driver.findElement(By.xpath("//div[@class='pay__partners']"));
            if (logos.isDisplayed()) {
                System.out.println("Логотипы платежных систем найдены");
            } else {
                System.out.println("Логотипы платежных систем не найдены");
            }
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент не найден");
        };

        // Проверка работы ссылки подробнее о сервисе
        try {
            WebElement moreInfoLink = driver.findElement(By.linkText("Подробнее о сервисе"));
            moreInfoLink.click();
            System.out.println("Ссылка 'Подробнее о сервисе' работает");
            driver.switchTo().defaultContent();
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент не найден");
        };

        // Возвращяемся на главную страницу
        try {
            WebElement back = driver.findElement(By.xpath("//*[@alt='МТС']"));
            back.click();
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент не найден");
        };

        // Заполняем поле номер телефона
        try {
            WebElement phoneNumberField = driver.findElement(By.id("connection-phone"));
            phoneNumberField.sendKeys("297777777");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент не найден");
        };

        // Проверка кнопки "Продолжить"
        try {
            WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
            continueButton.click();
            System.out.println("Кнопка 'Продолжить' работает");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент не найден");
        };

        driver.quit();
    }
}