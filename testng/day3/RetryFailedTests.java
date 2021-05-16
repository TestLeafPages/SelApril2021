package testng.day3;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{
	
	int maxRetry = 1;
	int retryCount = 0;

	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && retryCount < maxRetry) {
			retryCount++;
			return true;
		}
		return false;
	}

	

}
