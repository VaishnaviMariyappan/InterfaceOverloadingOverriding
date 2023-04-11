package IntefaceExample;

public  class AtosEmployee implements EmplyeeRules
{


public static void main(String[] args)
{
	AtosEmployee atos = new AtosEmployee();
	atos.maintainHours();
	atos.relocate();
	System.out.println(atos.salary);
	System.out.println(atos.workingHours);
	System.out.println(atos.leaves);
}
public void relocate() 
{
System.out.println("Relocate to Chennai");
}
public void maintainHours() 
{
System.out.println("8 Hours");	
}
}

