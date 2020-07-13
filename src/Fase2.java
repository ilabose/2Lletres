import java.util.ArrayList;
import java.util.List;

public class Fase2 {

	public static void main(String[] args) {
	
		 List<Character> t_nom = new ArrayList<>(14);
		 t_nom.add('I');
		 t_nom.add('l');
		 t_nom.add('a');
		 t_nom.add('r');
		 t_nom.add('i');
		 t_nom.add('a');
		 t_nom.add('7');
		 t_nom.add('B');
		 t_nom.add('o');
		 t_nom.add('s');
		 t_nom.add('e');
		 t_nom.add('l');
		 t_nom.add('l');
		 t_nom.add('i');

		 for (char lett : t_nom) {
			 if ((lett == 'a') || (lett == 'e') || (lett == 'i')|| (lett == 'o') || (lett == 'u')) {
				 System.out.println(lett + " - VOCAL -");
				 } else {
					 if (lett == '0' || lett == '1' || lett == '2' || lett == '3' || lett == '4' || lett == '5' || lett == '6' || lett == '7' || lett == '8' || lett == '9') {
						 System.out.println(lett + " !!!Els noms de les persones no contenen números!!!");}
					 else { 
		 				System.out.println(lett + " - CONSONANT -"); }
		 		}
		 	}
	}
}

