package testscrips;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.hamcrest.Matchers.*;

import pom.HomepagePom;


import com.base.SelUtils;
import com.base.Testbase;

public class CompareTemparature extends Testbase {
	public String sourcePlaceOne="Bengaluru, Karnataka";
	public String sourcePlaceTwo="Bengaluru, Karnataka";
	public static String sourceOneWeather;
	public static String sourceTwoWeather;
	public int tempDifference;
	
	@Test
	public void CompareTemparature() throws InterruptedException{

		HomepagePom HomeObj = new HomepagePom(driver);
		HomeObj.setLocation(sourcePlaceOne);
		HomeObj.getDisplayTemperatureSourceOne();
		HomeObj.clickOnHeaderLogo();
		HomeObj.setLocation(sourcePlaceTwo);
		HomeObj.getDisplayTemperatureSourceTwo();
		
		
	
		
		tempDifference = SelUtils.compareTemperature(sourcePlaceOne, sourcePlaceTwo);
	
		if(tempDifference == 0) {
			//We can print log or perform any desired actions / assertions
			System.out.println("Temperatures are same");
		}
		else {
			//Print the difference or perform any desired actions / assertions
			System.out.println("Temperatures are not same and the difference is "+tempDifference);
		}


	}


}
