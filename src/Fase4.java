import java.util.ArrayList;
import java.util.List;
public class Fase4 {

			public static void main(String[] args) {
				
				 List<Character> name = new ArrayList<>();
				 name.add('I');
				 name.add('l');
				 name.add('a');
				 name.add('r');
				 name.add('i');
				 name.add('a');
				 
				 List<Character> surname = new ArrayList<>();
				 surname.add('B');
				 surname.add('o');
				 surname.add('s');
				 surname.add('e');
				 surname.add('l');
				 surname.add('l');
				 surname.add('i');
				 
				 List<Character> fullname = new ArrayList<>(14);
				 fullname.addAll(name);
				 fullname.add(' ');	
				 fullname.addAll(surname);	
				 
				 System.out.println("FULLNAME: " + fullname);
				
			}
			
}		
