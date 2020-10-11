//package steps;
//
//public class SingletonPattern_Demo {
//
// private static SingletonPattern_Demo instanceOfSingletonPattern = null;
//
// private WebDriver driver;
//
// private SingletonPattern_Demo()
// {
//     System.setProperty("webdriver.chrome.driver","");
//     driver = new ChromeDriver();
// }
//
// public static SingletonPattern_Demo getInstanceOfSingletonPattern()
// {
//     if (instanceOfSingletonPattern==null)
//     {
//         instanceOfSingletonPattern = new SingletonPattern_Demo();
//     }
//     return instanceOfSingletonPattern;
// }
//
// public WebDriver getDriver()
// {
//     return driver;
// }
//}
