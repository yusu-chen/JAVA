package gushi;

import gushi.*;
public class Test {
	public static void main(String args[]) throws NewException
	{
		Changhenge changhenge;

		String write;
		write = "ǧ";
		try {
		changhenge = new Changhenge(write);
		if(write == "") 
		{
			throw new NewException("����������ַ�");
		}
		else 
		
			System.out.print(changhenge);
		}
		catch (NewException e) 
		{
			e.printStackTrace();
		}

		finally 
		{
			System.out.print("�������н���");
		}

	}
}