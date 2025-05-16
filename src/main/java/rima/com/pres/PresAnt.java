package rima.com.pres;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import rima.com.entities.Client;
import rima.com.metier.IBanquetMetier;

public class PresAnt {
    public static void main(String[] args) throws Exception {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("rima.com");

        IBanquetMetier metier = context.getBean(IBanquetMetier.class);

        metier.addClient(new Client(1L, "Rima"));
    }
}
