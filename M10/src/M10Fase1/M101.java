package M10Fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class M101 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Amy");
		names.add("kate");
		names.add("Ann");
		names.add("Helen");
		names.add("Sophia");
		names.add("Oliver");
		
		System.out.println(aAnd3(names));

	}
	
    public static List<String> aAnd3(List<String> names) {
        List<String> aAnd3Selected = names.stream()
                .filter(n -> n.startsWith("A") && n.length() == 3)
                .collect(Collectors.toList());
        return aAnd3Selected;
    }
    
}