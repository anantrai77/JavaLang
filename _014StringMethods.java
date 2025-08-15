public class _014StringMethods {
    public static void main(String[] args) {
    String name = "Anant";//01234
    System.out.println(name);
    int value = name.length();
    System.out.println(value);

    String lString = name.toLowerCase();
    System.out.println(lString);

    String uString = name.toUpperCase();
    System.out.println(uString);

    String nonTrimmedString =  "  Anant   ";
    System.out.println(nonTrimmedString);

    String trimmedString = nonTrimmedString.trim();
    System.out.println(trimmedString);

    System.out.println(name.substring(2));
    System.out.println(name.substring(1,4));

    System.out.println(name.replace('t', 'd'));
    System.out.println(name.replace("t","abc"));
    
    System.out.println(name.startsWith("nan"));
    System.out.println(name.startsWith("Ana"));
    System.out.println(name.endsWith("ant"));

    System.out.println(name.charAt(0));

    System.out.println(name.indexOf("n"));
    System.out.println(name.indexOf("nt"));

    String modifiedName = "Harryrry";
    System.out.println(modifiedName.indexOf("rry",4));
    System.out.println(modifiedName.indexOf("rry",4));
    System.out.println(modifiedName.indexOf("rryt"));
    System.out.println(modifiedName.lastIndexOf("rry",4));

    System.out.println(name.equals("Anant"));
    System.out.println(name.equals("anant"));
    System.out.println(name.equalsIgnoreCase("anant"));
    }
}

