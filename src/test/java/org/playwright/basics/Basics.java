package org.playwright.basics;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Basics {

	public Playwright playwright;
	public Browser browser;
	public BrowserContext browserContext;
	public Page page;
	@BeforeSuite
	public void launch() {
		playwright = Playwright.create();
		List<String>a = new ArrayList<>();
		a.add("--start-maximized");
		browser = playwright.chromium().launch(new LaunchOptions().setHeadless(false).setArgs(a));
		browserContext = browser.newContext(new NewContextOptions().setViewportSize(null));
		page = browserContext.newPage();
		page.navigate("https://rahulshettyacademy.com/loginpagePractise/");
//		page.pause();
	}
	@Test
	public void testOne() throws Exception {
		
	}
}
