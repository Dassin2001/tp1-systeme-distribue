package rima.com.dao;

import org.springframework.stereotype.Service;
import rima.com.entities.Client;
import rima.com.entities.Compte;
import rima.com.entities.Employe;
@Service
public class BanquetDaoImpl implements IBanquetDao {
    @Override
    public Client addClient(Client c) {
        System.out.println("DAO: Ajout client " + c.getNom());
        return c;
    }

    @Override
    public Employe addEmploye(Employe e, Long codeSup) {
        System.out.println("DAO: Ajout employé " + e.getNom());
        return e;
    }

    @Override
    public Compte addCompte(Compte cp, Long codeCli, Long codeEmp) {
        System.out.println("DAO: Ajout compte " + cp.getCode());
        return cp;
    }
}
