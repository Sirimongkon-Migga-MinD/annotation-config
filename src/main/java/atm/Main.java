package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSourceFile);

        //spring
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        ATM atm = new ATM(bank);
        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
