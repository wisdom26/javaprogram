public class InttoBinary {
    public static void main(String[] args) {
        
        int number = 10;
        StringBuilder a =new StringBuilder();
        int originalNumber = number;
        while(number>0){
            int binary = number%2;
            a.append(binary);
            number=number/2;
        }
        a.reverse();

        System.out.println("Integer: " + originalNumber + " to Binary: " + a);

        
    }



}
