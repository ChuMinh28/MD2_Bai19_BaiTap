package baitap3;

import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
            Scanner scanner = new Scanner(inputStreamReader);
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            content = content.replaceAll("\\n+","");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
