package org.playwright.alerts;

import org.playwright.basics.Basics;
import org.testng.annotations.Test;

import com.microsoft.playwright.Locator;

public class AlertsDemo extends Basics {

	@Test
	public void testName() throws Exception {
		page.onceDialog(p->{
			System.out.println(p.message());
			p.accept();
		});
		page.locator("a#alert").click();
		page.pause();
	}
	@Test
	public void testOne() throws Exception {
		Locator ax = page.locator("a#prompt");
		page.onceDialog(p->{
			System.out.println(p.message());
			p.accept("Hello");
		});
		page.locator("a#prompt").click();
		page.pause();
		
	}
}
