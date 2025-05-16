package rima.com.dao;

import org.springframework.stereotype.Repository;
import rima.com.entities.Client;
import rima.com.entities.Compte;
import rima.com.entities.Employe;
@Repository("dao2")
public class BanquetDaoImpl2 implements IBanquetDao {
    @Override
    public Client addClient(Client c) {
        return null;
    }

    @Override
    public Employe addEmploye(Employe e, Long codeSup) {
        return null;
    }

    @Override
    public Compte addCompte(Compte cp, Long codeCli, Long codeEmp) {
        return null;
    }
}
