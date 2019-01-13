public class Main {

    public static void main(String[] args) {

        output("Palindrome");
        output("Civic");
        output("Radar");
        output("Level");
        output("Eva, can I stab bats in a cave?");
        output("Mr. Owl ate my metal worm");
        output("Never odd or even");
        output("Doc, Note: I Dissent. A fast never prevents a fatness. I diet on cod.");
    }

    public static void output(String s){
        if(testPal(s)){
            System.out.println("True!  " + "\"" + s + "\"" + " is a palindrome!");
        }
        else{
            System.out.println("False!  " + "\""+ s + "\"" + " is not a palindrome!");
        }
    }

    public static boolean testPal(String s){
        String ignoreAll = s.replaceAll("[\\W]","");
        int len = ignoreAll.length();
        boolean palindrome = true;
        int n = 1;

        do {
            if(palindrome) {
                char bwdChar = ignoreAll.charAt(len - n);
                char fwdChar = ignoreAll.charAt(n - 1);
                palindrome = Character.toString(bwdChar).equalsIgnoreCase(Character.toString(fwdChar));
            }
            n++;
        } while (n<=(int)(len/2.0));

        return palindrome;
    }
}
