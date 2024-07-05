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
            WebElement buttonComplete = driver.findElement(By.xpath("//button[text()='Принять']"));
            buttonComplete.click();
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях услуги связи - 'Номер телефона'
        try {
            WebElement connectionPhone = driver.findElement(By.xpath("//input[@placeholder = 'Номер телефона']"));
            if(connectionPhone.isDisplayed()) System.out.println("Название блока 'Номер телефона' - найдено");
            else System.out.println("Название блока 'Номер телефона' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях услуги связи - 'Сумма'
        try {
            WebElement connectionSum = driver.findElement(By.xpath("//input[@placeholder = 'Сумма']"));
            if(connectionSum.isDisplayed()) System.out.println("Название блока 'Сумма' - найдено");
            else System.out.println("Название блока 'Сумма' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях услуги связи - 'E-mail для отправки чека'
        try {
            WebElement connectionEmail = driver.findElement(By.xpath("//input[@placeholder = 'E-mail для отправки чека']"));
            if(connectionEmail.isDisplayed()) System.out.println("Название блока 'E-mail для отправки чека' - найдено");
            else System.out.println("Название блока 'E-mail для отправки чека' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Меняем услугу
        try {
            WebElement buttonService = driver.findElement(By.xpath("//button[@class='select__header']"));
            buttonService.click();
            WebElement buttonInternet = driver.findElement(By.xpath("//p[text()='Домашний интернет']"));
            buttonInternet.click();
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях домашний интернет - 'Номер абонента'
        try {
            WebElement internetPhone = driver.findElement(By.xpath("//input[@placeholder = 'Номер абонента']"));
            if(internetPhone.isEnabled()) System.out.println("Название блока 'Номер абонента' - найдено");
            else System.out.println("Название блока 'Номер абонента' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях домашний интернет - 'Сумма'
        try {
            WebElement internetSum = driver.findElement(By.xpath("//input[@placeholder = 'Сумма']"));
            if(internetSum.isEnabled()) System.out.println("Название блока 'Сумма' - найдено");
            else System.out.println("Название блока 'Сумма' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях домашний интернет - 'E-mail для отправки чека'
        try {
            WebElement internetEmail = driver.findElement(By.xpath("//input[@placeholder = 'E-mail для отправки чека']"));
            if(internetEmail.isEnabled()) System.out.println("Название блока 'E-mail для отправки чека' - найдено");
            else System.out.println("Название блока 'E-mail для отправки чека' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Меняем услугу
        try {
            WebElement buttonService = driver.findElement(By.xpath("//button[@class='select__header']"));
            buttonService.click();
            WebElement buttonIp = driver.findElement(By.xpath("//p[text()='Рассрочка']"));
            buttonIp.click();
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях Рассрочка - 'Номер счета на 44'
        try {
            WebElement instalmentNumber = driver.findElement(By.xpath("//input[@placeholder = 'Номер счета на 44']"));
            if(instalmentNumber.isEnabled()) System.out.println("Название блока 'Номер счета на 44' - найдено");
            else System.out.println("Название блока 'Номер счета на 44' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях Рассрочка - 'Сумма'
        try {
            WebElement instalmentSum = driver.findElement(By.xpath("//input[@placeholder = 'Сумма']"));
            if(instalmentSum.isEnabled()) System.out.println("Название блока 'Сумма' - найдено");
            else System.out.println("Название блока 'Сумма' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях Рассрочка - 'E-mail для отправки чека'
        try {
            WebElement instalmentEmail = driver.findElement(By.xpath("//input[@placeholder = 'E-mail для отправки чека']"));
            if(instalmentEmail.isEnabled()) System.out.println("Название блока 'E-mail для отправки чека' - найдено");
            else System.out.println("Название блока 'E-mail для отправки чека' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Меняем услугу
        try {
            WebElement buttonService = driver.findElement(By.xpath("//button[@class='select__header']"));
            buttonService.click();
            WebElement buttonDebt = driver.findElement(By.xpath("//p[text()='Задолженность']"));
            buttonDebt.click();
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях Рассрочка - 'Номер счета на 2073'
        try {
            WebElement arrearsNumber = driver.findElement(By.xpath("//input[@placeholder = 'Номер счета на 2073']"));
            if(arrearsNumber.isEnabled()) System.out.println("Название блока 'Номер счета на 2073' - найдено");
            else System.out.println("Название блока 'Номер счета на 2073' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях Рассрочка - 'Сумма'
        try {
            WebElement arrearsSum = driver.findElement(By.xpath("//input[@placeholder = 'Сумма']"));
            if(arrearsSum.isEnabled()) System.out.println("Название блока 'Сумма' - найдено");
            else System.out.println("Название блока 'Сумма' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка надписи в незаполненных полях Рассрочка - 'E-mail для отправки чека'
        try {
            WebElement arrearsEmail = driver.findElement(By.xpath("//input[@placeholder = 'E-mail для отправки чека']"));
            if(arrearsEmail.isEnabled()) System.out.println("Название блока 'E-mail для отправки чека' - найдено");
            else System.out.println("Название блока 'E-mail для отправки чека' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Меняем услугу и заполняем данными поля
        try {
            WebElement buttonService = driver.findElement(By.xpath("//button[@class='select__header']"));
            buttonService.click();
            WebElement buttonDebt = driver.findElement(By.xpath("//p[text()='Услуги связи']"));
            buttonDebt.click();

            WebElement phoneNumberField = driver.findElement(By.id("connection-phone"));
            phoneNumberField.sendKeys("297777777");
            WebElement sumField = driver.findElement(By.id("connection-sum"));
            sumField.sendKeys("200");
            WebElement buttonComplete = driver.findElement(By.xpath("//button[contains(text(), 'Продолжить')]"));
            buttonComplete.click();

        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверяем корректность отображения суммы
        try {
            WebElement arrearsNumber = driver.findElement(By.xpath("//span[text()='200.00 BYN']"));
            if(arrearsNumber.isEnabled()) System.out.println("Название блока '200.00 BYN' - найдено");
            else System.out.println("Название блока '200.00 BYN' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        try {
            WebElement arrearsNumber = driver.findElement(By.xpath("//button[text()=' Оплатить  200.00 BYN ']"));
            if(arrearsNumber.isEnabled()) System.out.println("Название блока ' Оплатить  200.00 BYN ' - найдено");
            else System.out.println("Название блока ' Оплатить  200.00 BYN ' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверяем корректность отображения номмера телефона
        try {
            WebElement arrearsNumber = driver.findElement(By.xpath("//div[@class='pay-description__text']"));
            if(arrearsNumber.isEnabled()) System.out.println("Название блока 'Номер:375297777777' - найдено");
            else System.out.println("Название блока 'Номер:375297777777' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверяем незаполненные поля для ввода реквизитов карты
        try {
            WebElement arrearsNumber = driver.findElement(By.xpath("//label[text()='Номер карты']"));
            if(arrearsNumber.isEnabled()) System.out.println("Название блока 'Номер карты' - найдено");
            else System.out.println("Название блока 'Номер карты' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        try {
            WebElement arrearsNumber = driver.findElement(By.xpath("//label[text()='Срок действия']"));
            if(arrearsNumber.isEnabled()) System.out.println("Название блока 'Срок действия' - найдено");
            else System.out.println("Название блока 'Срок действия' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        try {
            WebElement arrearsNumber = driver.findElement(By.xpath("//label[text()='CVC']"));
            if(arrearsNumber.isEnabled()) System.out.println("Название блока 'CVC' - найдено");
            else System.out.println("Название блока 'CVC' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        try {
            WebElement arrearsNumber = driver.findElement(By.xpath("//label[text()='Имя держателя (как на карте)']"));
            if(arrearsNumber.isEnabled()) System.out.println("Название блока 'Имя держателя (как на карте)' - найдено");
            else System.out.println("Название блока 'Имя держателя (как на карте)' - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        // Проверка наличие иконок платёжных систем
        try {
            WebElement arrearsNumber = driver.findElement(By.xpath("//div[@class='cards-brands ng-tns-c46-1']"));
            if(arrearsNumber.isEnabled()) System.out.println("Наличие иконок платежных систем - найдено");
            else System.out.println("Наличие иконок платежных систем - НЕ найдено");
        }catch (NoSuchElementException e)
        {
            System.out.println("Ошибка - Элемент НЕ найден");
        }

        driver.quit();
    }
}