package management;

import customerdal.ICustomerDal;
import database.BaseDatabaseManager;
import logger.BaseLogger;

public class CustomerManager {
    private BaseLogger []loggers;
    private BaseDatabaseManager [] baseDatabaseManagers;
    private ICustomerDal[] customerDals;

    public CustomerManager(BaseLogger [] logger){
        this.loggers= logger;

    }
    public CustomerManager(BaseDatabaseManager... baseDatabaseManager ){
        this.baseDatabaseManagers=baseDatabaseManager;

    }
    public CustomerManager(ICustomerDal... customerDals){
        this.customerDals=customerDals;

    }


    public void add(){
        //System.out.println("müşteri eklendi");
        for (BaseLogger logger: loggers)
        {
            logger.Log("müşteri eklendi");
        }
    }

    public void  getCustomers(){
        for (BaseDatabaseManager baseDatabaseManager: baseDatabaseManagers){
            baseDatabaseManager.getData();
        }

    }

    public void  runCustomerDal(){
        for (ICustomerDal customerDal:customerDals){
            customerDal.add();
        }
    }



}
