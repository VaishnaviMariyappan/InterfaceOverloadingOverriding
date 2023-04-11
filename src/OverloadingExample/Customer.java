package OverloadingExample;

public class Customer
{
public static void main (String[] args)
{
Customer vaishnavi=new Customer();
vaishnavi.fillForm("Vaishnavi",897877878,"vaishnavisaisai5gmail.com");
Customer shivani=new Customer();
shivani.fillForm("Shivani",908447929,"shivani234gmail.com","Madurai");
}

private void fillForm(String string, int i, String string2, String string3)
{

	System.out.println("Shivani");
	
}

private void fillForm(String string, int i, String string2)
{
	
System.out.println("Vaishnavi");	
}
}

