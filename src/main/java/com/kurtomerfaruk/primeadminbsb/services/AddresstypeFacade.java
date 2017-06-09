package com.kurtomerfaruk.primeadminbsb.services;

import com.kurtomerfaruk.primeadminbsb.models.Addresstype;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Omer Faruk KURT 
 * @mail kurtomerfaruk@gmail.com
 * @blog : http://kurtomerfaruk.com
 * Created on date 27.01.2017 23:13:02
 */
@Stateless
public class AddresstypeFacade extends AbstractFacade<Addresstype> {

    @PersistenceContext(unitName = "ADMINBSB_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AddresstypeFacade() {
        super(Addresstype.class);
    }

}
