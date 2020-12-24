package M10Fase1;

import java.util.*;
import java.util.stream.*;

public class M103 {

	public static void main(String[] args) {
	
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Amy");
		names.add("kate");
		names.add("Ann");
		names.add("Helen");
		names.add("Sophia");
		names.add("Oliver");
		
		System.out.println(searchingO(names));

		}
	
	public static List<String> searchingO(List<String> strings) { 
		return strings.stream()
				.filter(s -> s.contains("o") || s.contains("O"))
				.collect(Collectors.toList());
	}
	
}