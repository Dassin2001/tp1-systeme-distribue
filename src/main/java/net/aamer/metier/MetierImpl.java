package net.aamer.metier;

import net.aamer.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    //@Qualifier("d2")
    private IDao dao;//couplage faible
    //constructor

// ou bien on utilise seulement constructor avec parametre
// pour injecter dans attribut dao un object de type idao , classe qui implemete interface Idao
// ou moment de instenciation
    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {}
// le constructor sans parametre avec setter
// apres instanciantion

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t*2;
        return res;
    }
    //pour injecter dans attribut dao un object de type idao , classe qui implemete interface Idao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
