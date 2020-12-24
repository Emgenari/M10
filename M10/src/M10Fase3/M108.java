package M10Fase3;

public class M108 {

	public static void main(String[] args) {
		
        ReverseFunctionalInterface reverseString = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };

        System.out.println(reverseString.reverse("Hello World"));
    }
}