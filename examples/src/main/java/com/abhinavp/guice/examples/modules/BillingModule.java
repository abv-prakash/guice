package com.abhinavp.guice.examples.modules;

import com.abhinavp.guice.examples.impl.MySqlTransactionLog;
import com.abhinavp.guice.examples.impl.PayPalCreditCardProcessor;
import com.abhinavp.guice.examples.interfaces.CreditCardProcessor;
import com.abhinavp.guice.examples.interfaces.TransactionLog;
import com.google.inject.AbstractModule;


/**
 * @author abhinav.prakash
 * 
 */
public class BillingModule extends AbstractModule
{

    /*
     * (non-Javadoc)
     * 
     * @see com.google.inject.AbstractModule#configure()
     */
    @Override
    protected void configure()
    {
        bind(TransactionLog.class).to(MySqlTransactionLog.class);
        bind(CreditCardProcessor.class).to(PayPalCreditCardProcessor.class);

    }

}
