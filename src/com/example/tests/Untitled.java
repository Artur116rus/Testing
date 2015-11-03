package com.example.tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class Untitled {

	private Utils getUtils() {
		return new Utils();
	}

	@Test
	public void testUntitled() throws Exception {
		Utils utils = getUtils();
		utils.driver.get(utils.baseUrl + "/");
		utils.driver.findElement(By.id("name0")).clear();
		utils.driver.findElement(By.id("name0")).sendKeys("Казань");
		utils.driver.findElement(By.cssSelector("div.greyBlock")).click();
		utils.driver.findElement(By.id("name1")).clear();
		utils.driver.findElement(By.id("name1")).sendKeys("МОСКВА");
		utils.driver.findElement(By.cssSelector("div.all_forma")).click();
		utils.driver.findElement(By.id("Submit1")).click();
		utils.driver.findElement(By.id("name0")).click();
		utils.driver.findElement(By.id("name0")).clear();
		utils.driver.findElement(By.id("name0")).sendKeys("КАЗАНЬ ПАСС");
		utils.driver.findElement(By.cssSelector("div.all_forma")).click();
		utils.driver.findElement(By.id("Submit")).click();
		utils.quit();
	}

	@Test
	public void testUntitled5() throws Exception {
		Utils utils = getUtils();
		utils.driver.get(utils.baseUrl + "/");
		utils.driver.findElement(By.id("headSearchField")).clear();
		utils.driver.findElement(By.id("headSearchField")).sendKeys(
				"билеты в лондон");
		utils.driver.findElement(By.cssSelector("input[type=\"image\"]"))
				.click();
		utils.quit();
	}

	@Test
	public void testUntitled3() throws Exception {
		Utils utils = getUtils();
		utils.driver.get(utils.baseUrl + "/");
		utils.driver.findElement(By.name("name")).clear();
		utils.driver.findElement(By.name("name")).sendKeys("Oleg");
		utils.driver.findElement(By.name("password")).clear();
		utils.driver.findElement(By.name("password")).sendKeys("sjflsjlfj");
		utils.driver.findElement(By.xpath("//input[@value='Вход']")).click();
		utils.quit();
	}
}
