//package steps;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//    public class SingletonBrowserClass {
//
//        private WebDriver driver;
//
//        // instance of singleton class
//        private static SingletonBrowserClass instanceOfSingletonBrowserClass=null;
//
//        // Constructor
//        private SingletonBrowserClass(){
//            System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
//            driver= new ChromeDriver();
//        }
//
//        // TO create instance of class
//        public static SingletonBrowserClass getInstanceOfSingletonBrowserClass(){
//            if(instanceOfSingletonBrowserClass==null){
//                instanceOfSingletonBrowserClass = new SingletonBrowserClass();
//            }
//            return instanceOfSingletonBrowserClass;
//        }
//
//        // To get driver
//        public WebDriver getDriver()
//        {
//            return driver;
//        }
//
//}
