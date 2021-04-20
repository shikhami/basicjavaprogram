
         
import java.io.*;
import java.net.*;

public class Rest {

    public static void main(String[] args) throws IOException {
        URL url = new URL(www.example.com/api/get/1);
        String query = INSERT_HERE_YOUR_URL_PARAMETERS;

       
        URLConnection urlc = url.openConnection();

        
        urlc.setDoOutput(true);
        urlc.setAllowUserInteraction(false);

      
        PrintStream ps = new PrintStream(urlc.getOutputStream());
        ps.print(query);
        ps.close();

      
        BufferedReader br = new BufferedReader(new InputStreamReader(urlc
            .getInputStream()));
        String l = null;
        while ((l=br.readLine())!=null) {
            System.out.println(l);
        }
        br.close();
    }
}