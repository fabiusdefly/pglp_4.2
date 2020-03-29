package fr.uvsq.pglp;
import java.util.EmptyStackException;

public class Plus implements SpecificCommand {
	private final Specific calcul; 
	private final MoteurRPN moteur;
	
	public Plus(Specific calcul,MoteurRPN moteur) {
		this.calcul=calcul;
		this.moteur=moteur;
	}

	public void apply() {
		double a=0,b = 0;
		int vide=0;//variable permettant de verifier si la pile est ou contient plus d'un element
		try {
			a= moteur.depiler();
			vide++;
	    	b= moteur.depiler();
			moteur.enregistrer(this.operation(b, a));
		} catch (EmptyStackException e) {
			// TODO: handle exception
			System.out.println("Ajoutez une operande ...");
			if(vide==1)
				moteur.enregistrer(a);
		}
		
	}

	public double operation(double a, double b) {
		// TODO Auto-generated method stub
		return calcul.Plus(a, b);
	}

	public void apply(int a, int b) {
		// TODO Auto-generated method stub
		
	}


}