package String;

public class compare_string {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=new String("Hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        String s3="HELLO";
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.compareTo(s2));

        String s4="Jello";
        System.out.println(s1.compareTo(s4));
    }
}
