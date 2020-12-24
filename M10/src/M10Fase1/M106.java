package M10Fase1;

import java.util.*;
import java.util.function.Consumer;


public class M106 {

	public static void main(String[] args) {
	
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

        Consumer<String[]>method = M106::useMethodReference;
        method.accept(months);

		}
	
    public static void useMethodReference(String[] months){
        Arrays.stream(months).forEach(System.out::println);
    }
    
}