/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kurtomerfaruk.primeadminbsb.services;

import com.kurtomerfaruk.primeadminbsb.models.Shoppingcartitem;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 10/08/2017 19:56:58 
 * @blog https://ofarukkurt.blogspot.com.tr/
 * @mail kurtomerfaruk@gmail.com
 */
@Stateless
public class ShoppingcartitemFacade extends AbstractFacade<Shoppingcartitem> {
    @PersistenceContext(unitName = "ADMINBSB_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ShoppingcartitemFacade() {
        super(Shoppingcartitem.class);
    }

}
