package com.abhinavp.guice.examples.impl;

import com.abhinavp.guice.examples.interfaces.BillingService;
import com.abhinavp.guice.examples.interfaces.CreditCardProcessor;
import com.abhinavp.guice.examples.interfaces.TransactionLog;
import com.abhinavp.guice.examples.modules.BillingModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;


/**
 * @author abhinav.prakash
 * 
 */
public class RealBillingService implements BillingService
{

    private final TransactionLog      log;
    private final CreditCardProcessor processor;

    @Inject
    public RealBillingService(final CreditCardProcessor processor, final TransactionLog log)
    {

        this.processor = processor;
        this.log = log;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.abhinavp.guice.examples.interfaces.BillingService#payBill()
     */
    public int payBill()
    {
        System.out.println("Paying the real time bill");
        processor.charge();
        log.doTransaction();
        return 0;
    }

    /**
     * @param args
     */
    public static void main(final String[] args)
    {
        Injector injector = Guice.createInjector(new BillingModule());

        BillingService billingService = injector.getInstance(RealBillingService.class);

        billingService.payBill();

    }

}
