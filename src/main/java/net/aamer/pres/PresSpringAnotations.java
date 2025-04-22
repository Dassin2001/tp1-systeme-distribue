package net.aamer.pres;

import net.aamer.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnotations {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
         new AnnotationConfigApplicationContext("net.aamer.dao","net.aamer.metier");
        IMetier metier = (IMetier) applicationContext.getBean(IMetier.class);
        System.out.println("Res"+(metier.calcul()+30));
    }
}
