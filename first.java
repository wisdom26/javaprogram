public class first {
        public static void main(String[]args){
        
        float b = 2.65f;
        double e = 0;
        System.out.println(e);
        System.out.println(b);




        double f = 4.56788999876;
        float d = 4.5678899987f;
      
        System.out.println("double exceps: "+f);
        System.out.println("float excepts: "+d);

        String a = "vivek";
        Boolean x = true;
        System.out.println(a); 
        System.out.println(x);
        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println(a.indexOf('a'));
        System.out.println(a.indexOf('o'));
        System.out.println("if the character not found: "+a.indexOf('x'));
        System.out.println(a.contains(a));
        System.out.println(a.contains("z"));

        String q = "    Vivek  Maurya   ";
        System.out.println(q);
        System.out.println(q.trim());
        System.out.println(q.charAt(2));
        System.out.println(q.startsWith(""));
        System.out.println(q.endsWith(""));


        String s = "My name";
        String z = "Vivek ";
        String c = "Maurya ";
        String w= "from Varanasi";

        
        System.out.println(String.join("Hello" ,"UP", "India"));
        System.out.println(String.join("$$", s,z,c,w));
        
        




        // System.out.println(s+ " "+z " " +c " " +w);
        // System.out.println(a.concat(b));


        // a.concat(b).concat(c).concat(d);
    

        // String x = a.concat(b);
        // System.out.println(x);

        // String y = x.concat(c);
        // System.out.println(y);

        // String z = y.concat(d);
        // System.out.println(z);

        // System.out.println(a.concat(b).concat(c).concat(d));







        
                String aa = "My name";
                String bb = "vivek";
                String cc = "maurya";
                String dd = "from Varanasi";
                String ee = "UP";
        
                System.out.println(ee.replace('i', '@'));
                System.out.println(bb.replace('i', '7'));
                System.out.println(cc.replaceFirst("v", "@"));
                System.out.println(dd.replaceAll("r", "@"));
                System.out.println("replace returns: "+aa.replaceFirst("y", "@"));
                System.out.println("replace all returns: "+dd.replaceAll("f", "@"));
               
            
        

    }   
    
}

