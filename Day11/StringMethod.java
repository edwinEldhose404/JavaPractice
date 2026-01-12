package Day11;

public class StringMethod {
    public static void main(String[] args){
        String s = "Hello World";
        String s2 = "hello world";

        System.out.println("===== Length & Check =====");
        System.out.println(s.length());
        System.out.println(s.isEmpty());

        System.out.println("\n===== Character Access =====");
        System.out.println(s.charAt(0));
        System.out.println(s.codePointAt(0));
        System.out.println(s.codePointBefore(1));
        System.out.println(s.codePointCount(0, s.length()));

        System.out.println("\n===== Comparison =====");
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s.compareTo(s2));
        System.out.println(s.compareToIgnoreCase(s2));

        System.out.println("\n===== Checking Content =====");
        System.out.println(s.contains("World"));
        System.out.println(s.startsWith("Hel"));
        System.out.println(s.endsWith("ld"));

        System.out.println("\n===== Index Methods =====");
        System.out.println(s.indexOf("o"));
        System.out.println(s.lastIndexOf("o"));
        System.out.println(s.indexOf("o", 5));

        System.out.println("\n===== Substring =====");
        System.out.println(s.substring(6));
        System.out.println(s.substring(0, 5));

        System.out.println("\n===== Case Conversion =====");
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println("\n===== Trim / Strip =====");
        String t = "  hello  ";
        System.out.println(t.trim());
        System.out.println("Java 11+: strip() -> " + t.strip());
        System.out.println("stripLeading -> " + t.stripLeading());
        System.out.println("stripTrailing -> " + t.stripTrailing());

        System.out.println("\n===== Replace =====");
        System.out.println(s.replace("World", "Java"));
        System.out.println(s.replaceFirst("o", "O"));
        System.out.println(s.replaceAll("o", "0"));

        System.out.println("\n===== Split =====");
        String x = "Java,Python,C++";
        for(String p : x.split(",")) System.out.println(p);

        System.out.println("\n===== Join =====");
        System.out.println(String.join("-", "A", "B", "C"));

        System.out.println("\n===== Concat =====");
        System.out.println(s.concat("!!!"));

        System.out.println("\n===== Value Conversion =====");
        System.out.println(String.valueOf(100));
        System.out.println(String.valueOf(true));

        System.out.println("\n===== Formatting =====");
        System.out.println(String.format("Name: %s Age: %d", "John", 25));

    }
}
