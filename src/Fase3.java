import java.util.HashMap;


public class Fase3 {

	public static void main(String[] args) {
		HashMap<String, Mapnom> nomi = new HashMap<String, Mapnom>();
		
		nomi.put("I", new Mapnom("2"));
		nomi.put("L", new Mapnom("1"));
		nomi.put("A", new Mapnom("2"));
		nomi.put("R", new Mapnom("1"));
		nomi.put("I", new Mapnom("2"));
		nomi.put("A", new Mapnom("2"));
		
		System.out.println(nomi);
	}
}
	class Mapnom{
		public Mapnom(String n){
			lett=n;
		}
		public String toString(){
			return" este letra aparece " +lett+ " veces";
		}
		private String lett;
}
