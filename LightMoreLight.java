import java.io.*;
//10110

class LightMoreLight {
    public static void main(String [] args) throws IOException {
        String line;
        String nonSq = "2378"; //last digit of squares
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(!(line = br.readLine()).equals("0")) {
            if(nonSq.indexOf(line.charAt(line.length()-1)) <0 ){
                long n = Long.parseLong(line);
                double root = Math.sqrt(n);
                if (root != Math.floor(root))
                    System.out.println("no");
                else
                    System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }
}
