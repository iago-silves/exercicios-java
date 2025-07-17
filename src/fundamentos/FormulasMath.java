package fundamentos;

public class FormulasMath {
	public static void main(String[] args) {
		 double numA;
		 double denA;
		 double superiorA;
		 double superior;
		 double numB;
		 double denB;
		 double superiorB;
		 double inferior;
		 double resultado;
		 
		 numA = 6 * (3 + 2);
		 denA = 3 * 2;
		 superiorA = Math.pow(numA, 2) / denA;
		 
		 numB = (1 - 5) * (2 - 7);
		 denB = 2;
		 superiorB = Math.pow(numB, 2) / denB;
		 
		 superior = Math.pow(superiorA - superiorB, 3);
		 inferior = Math.pow(10, 3);
		 
		 resultado = - (superior / inferior);
		 
		 System.out.println(resultado);
	}
}