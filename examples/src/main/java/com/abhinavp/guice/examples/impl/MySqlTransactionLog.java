package com.abhinavp.guice.examples.impl;

import com.abhinavp.guice.examples.interfaces.TransactionLog;


/**
 * @author abhinav.prakash
 * 
 */
public class MySqlTransactionLog implements TransactionLog
{

    /*
     * (non-Javadoc)
     * 
     * @see com.abhinavp.guice.examples.interfaces.TransactionLog#doTransaction()
     */
    public Boolean doTransaction()
    {
        System.out.println("Performing the transaction ");
        return null;
    }

    /**
     * @param args
     */
    public static void main(final String[] args)
    {
        // TODO Auto-generated method stub

    }

}
