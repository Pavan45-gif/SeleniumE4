package com.crm.VtigerTestCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.VtigerLogin;

public class VtigerLog {
	@Test
	public void log() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		assertEquals("http://localhost:8888/index.php?action=Login&module=Users", driver.getCurrentUrl());
		
		VtigerLogin vl = new VtigerLogin(driver);
		vl.login("admin", "root");
		
	}

}
