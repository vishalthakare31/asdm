
interface   vehicle
{
int code=12434; //all variable are public static and final 
void show(); // all methods are public and abstract


default void banner()
{
	System.out.println("welcome to java world");
}
	
static void printing()
{
	System.out.println("this is static interface method ");
}
}


public class InterfaceExample  implements vehicle
{
  public void show() { System.out.println("show method");}
  
	public static void main(String[] args) {
		InterfaceExample i= new InterfaceExample();
		i.banner();
		i.show();
		vehicle.printing();

	}

}
