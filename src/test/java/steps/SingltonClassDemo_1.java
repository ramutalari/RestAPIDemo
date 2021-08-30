//package steps;
//
//public class SingltonClassDemo_1 {
//
//    private WebDriver driver;
//
//    private static SingltonClassDemo_1 instanceOfSingltonClass = null;
//
//    private SingltonClassDemo_1()
//    {
//        System.setProperty("webdriver.chrome.driver","");
//        driver = new ChromeDriver();
//    }
//
//    public static getinstanceOfSingltonClass()
//    {
//        if (instanceOfSingltonClass==null){
//            instanceOfSingltonClass = new SingltonClassDemo_1();
//        }
//        return instanceOfSingltonClass;
//
//    }
//
//    public WebDriver getDriver()
//    {
//        return driver;
//    }
//
//}
