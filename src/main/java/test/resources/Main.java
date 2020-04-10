package test.resources;

import java.io.IOException;
import java.util.ResourceBundle;

public class Main
{
	public static void main(String[] args)
	{
		runResourceBundle();
		runModuleResource();
	}

	public static void runResourceBundle()
	{

		final var resourceBundle = ResourceBundle.getBundle("testPkg.testResourceBundle");
		System.out.println(resourceBundle.getString("testProperty"));
	}

	public static void runModuleResource()
	{
		final var module = Main.class.getModule();
		try (final var inputStream = module.getResourceAsStream("testPkg/hello.txt"))
		{
			final byte[] data = inputStream.readAllBytes();
			System.out.println(new String(data));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
