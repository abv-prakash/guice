package com.abhinavp.guice.examples.impl;

import com.abhinavp.guice.examples.interfaces.CreditCardProcessor;


/**
 * @author abhinav.prakash
 * 
 */
public class PayPalCreditCardProcessor implements CreditCardProcessor
{

    /*
     * (non-Javadoc)
     * 
     * @see com.abhinavp.guice.examples.interfaces.CreditCardProcessor#charge()
     */
    public void charge()
    {
        System.out.println("Charging the customer via pay pal credit card processor");

    }

    /**
     * @param args
     */
    public static void main(final String[] args)
    {
        // TODO Auto-generated method stub

    }

}
