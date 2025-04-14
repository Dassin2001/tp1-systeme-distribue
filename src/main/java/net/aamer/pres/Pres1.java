package net.aamer.pres;

import net.aamer.dao.DaoImpl;
import net.aamer.dao.IDao;
import net.aamer.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);// via le constructor
        //metier.setDao(d);//injection des dependance via setyter
        System.out.println("Res =  :"+metier.calcul());
    }
}
