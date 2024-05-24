public class ComplexNumbers {
    
    public static void main(String[] args) {
        int a=5;
        int b =4;
        int c=7;
        int d=3;
        String e = a + " + " + b + "i";
        String f = c + " + " + d+ "i";

        int realPart = a + c;
        int imagPart = b + d;
        String sum = realPart + " + " + imagPart + "i";
        
        System.out.println("Complex number e: " + e);
        System.out.println("Complex number f: " + f);
        System.out.println("Sum of e and f: " + sum);
    }
}
