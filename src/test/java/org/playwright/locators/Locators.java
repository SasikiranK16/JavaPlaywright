package org.playwright.locators;

import org.playwright.basics.Basics;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

public class Locators extends Basics {

	@Test
	public void testLocators() throws Exception {

		/* Get By Label */
		page.getByLabel("username").fill("Hello");

		/* Get By Role */
		page.getByRole(AriaRole.TEXTBOX, new GetByRoleOptions().setName("password")).fill("Hellos");
		
		page.pause();
	}
}
