package rima.com.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import rima.com.dao.IBanquetDao;
import rima.com.entities.*;
import rima.com.metier.IBanquetMetier;

@Service
public class BanquetMetierImplementation implements IBanquetMetier {

    @Qualifier("dao1")
    private IBanquetDao dao;
/**
    public BanquetMetierImplementation() {}

    @Autowired
    public void setDao(IBanquetDao dao) {
        this.dao = dao;
    }**/
    public Client addClient(Client c) {
        return dao.addClient(c);
    }

    public Employe addEmploye(Employe e, Long codeSup) {
        return dao.addEmploye(e, codeSup);
    }

    public Compte addCompte(Compte cp, Long codeCli, Long codeEmp) {
        return dao.addCompte(cp, codeCli, codeEmp);
    }
}
