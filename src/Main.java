import customerdal.*;
import management.CustomerManager;

public class Main {
    public  static  void main(String[]args )

    {

        /*
        BaseLogger [] loggerDes= new BaseLogger[]{new FileLogger(),new ConsoleLogger(),new EmailLogger(),new BaseLogger()};
        CustomerManager customerManager = new CustomerManager(loggerDes);
        customerManager.Add();
        */

        /*
        GameCalculator [] gameCalculators = { new WomanGameCalculator(),new ManGameCalculator()};
        for (GameCalculator gameCalculator: gameCalculators){
            gameCalculator.hesapla(100);
            gameCalculator.gameOver();
        }
        */


/*        CustomerManager customerManager = new CustomerManager(new SqlServerDatabaseManager(),new OracleDatabaseManager());

        customerManager.getCustomers();*/


        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal(),new MySqlCustomerDal());
        customerManager.runCustomerDal();

    }
}
