package StringLearn;

public class StringLearn {
    public static void main(String[] args) {
        // Write your code here
        //string can not be changed after initialized
        
        String s = "Hello World!";
        System.out.println(s.charAt(0));
        System.out.println(s.indexOf('W'));
        System.out.println(s.length());
        System.out.println(s.substring(1, 4));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s);
    }
}
