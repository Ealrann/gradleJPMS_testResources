package test.resources.test;

import org.junit.jupiter.api.Test;
import test.resources.Main;

public class MainTest
{
	@Test
	public void testResourceBundle()
	{
		Main.runResourceBundle();
	}

	@Test
	public void testModuleResource()
	{
		Main.runModuleResource();
	}
}
