
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("comamos aceituna");
		
		Persona carlos = new Persona();
		carlos.name = "Carlos Eduardo";
		carlos.age = 30;
		System.out.println(carlos.saludar());
		System.out.println(carlos.miEdad());
		
		Persona alexis = new Persona();
		alexis.name = "Miguel Alexis";
		alexis.age = 26;
		System.out.println(alexis.saludar());
		System.out.println(alexis.miEdad());

	}

}
