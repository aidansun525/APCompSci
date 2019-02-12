public class Main {

    public static void main(String[] args) {

        Integer numbersTo[] = {0,1,63,127,255,256};

        for(int i = 0; i < numbersTo.length; i++ ){
            System.out.println(numbersTo[i] + ":" +  "Binary:" + toBinary(numbersTo[i]) + "   Octal:" + toOctal(numbersTo[i]) + "   Hexadecimal: " + toHex(numbersTo[i]));
        }

    }

    public static String toBinary(int dec){


        int n, nextBinary;

        String binary = "";

        n = dec;
        while(n > 0)
        {
            nextBinary = n % 2;
            binary = binary + "" + nextBinary;
            n = n / 2;
        }
        return binary;
    }

    public static String toOctal(int dec){

        int nextOctal;
        int n = dec;

        String octal= "" ;

        char digit[]={'0','1','2','3','4','5','6','7'};

        while(n>0) {
            nextOctal=n%8;
            octal=digit[nextOctal]+octal;
            n=n/8;
        }

        return octal;
    }

    public static String toHex(int dec){

        int nextHex;
        int n = dec;

        String hex= "" ;

        char digit[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(n>0) {
            nextHex=n%16;
            hex=digit[nextHex]+hex;
            n=n/16;
        }

        return hex;
    }
}
