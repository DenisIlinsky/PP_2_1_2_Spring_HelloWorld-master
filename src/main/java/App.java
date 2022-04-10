import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getName());
        System.out.println(catBean2.getName());

        boolean beanObjects = bean == bean2;
        boolean catBeanObjects = catBean == catBean2;
        System.out.println(beanObjects);
        System.out.println(catBeanObjects);
    }
}