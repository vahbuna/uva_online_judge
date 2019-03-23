import java.io.*;
import java.util.HashSet;
// 10038
public class JollyJumpers {
    public static void main(String [] args) throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while((line = br.readLine()) !=null) {
            HashSet<Integer> diffs = new HashSet<Integer>();
            String [] inputs = line.split(" ");
            int n = Integer.parseInt(inputs[0]);
            for(int i=1; i<n; i++)
                diffs.add(i);
            for(int i=1; i<inputs.length - 1; i++) {
                int a = Integer.parseInt(inputs[i]);
                int b = Integer.parseInt(inputs[i+1]);
                diffs.remove(Math.abs(a-b));
            }
            if(diffs.size() == 0)
                System.out.println("Jolly");
            else
                System.out.println("Not jolly");
        }
    }    
}
