package OtherMainTheme.Annotation;

import java.lang.annotation.*;

public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class xiomiClass = Class.forName("OtherMainTheme.Annotation.Xioami");

        Annotation annotation  = xiomiClass.getAnnotation(SmartPhone.class);

        SmartPhone smartPhone = (SmartPhone) annotation;
        System.out.println("Annotation info from xiomi class " + smartPhone.OS() + " " + smartPhone.yearOfCompanyCreation());





    }
}
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS()  default "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone()
class Xioami{
    String model;
    double price;
}
@SmartPhone(OS = "IOS",yearOfCompanyCreation = 2004)
class Iphone{
    String model;
    double price;
}