package batchExecution;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({users.UserMethods.class, 
	customers.CustomerMethods.class})
public class BatchRun {

}
