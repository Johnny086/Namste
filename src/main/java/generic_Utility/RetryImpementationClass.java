package generic_Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImpementationClass implements IRetryAnalyzer {

	int limit = 1;
	int count = 0;
	
	public boolean retry(ITestResult result) {

	while(count<limit) {
	count++;
	return true;
	}	
	return false;
	}

}
