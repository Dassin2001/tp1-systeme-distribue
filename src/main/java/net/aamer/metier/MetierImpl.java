package net.aamer.metier;

import net.aamer.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;//couplage faible
    //constructor

// ou bien on utilise seulement constructor avec parametre
// pour injecter dans attribut dao un object de type idao , classe qui implemete interface Idao
// ou moment de instenciation
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
// le constructor sans parametre avec setter
// apres instanciantion
    public MetierImpl() {
    }

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
