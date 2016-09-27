import java.awt.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;












import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebResponse;

/**
 * 
 * 
 * this class is good
 *
 */
public class HelloWorld 
{
	
	public enum test{uno, due, tre};
	
	/**
	 *   
	 * 
	 * this method does things
	 * @throws IOException 
	 */
	public static void main(String args[]) throws IOException
	{
		System.out.println("modificato da Lord Miscrit");
//		LocalDate oggi=LocalDate.now();
//		DateFormatSymbols dfs = new DateFormatSymbols(Locale.ITALY);
//		GregorianCalendar gc = new GregorianCalendar();
//		System.out.println(gc.get(Calendar.DAY_OF_MONTH)+"-"+dfs.getMonths()[gc.get(Calendar.MONTH)].substring(0, 3).toUpperCase()+"-"+Integer.toString(gc.get(Calendar.YEAR)).substring(2, 4));
//		System.out.println(oggi);
//		Month mese=oggi.getMonth();
//		System.out.println(mese);
		
//		Map <String, String> mappa=new TreeMap<>();
//		System.out.println(mappa.size());
		
//		List<String> lista=new ArrayList<>();
//		lista.add("primo");
//		lista.add("secondo");
//		lista.add("terzo");
//		System.out.println(lista.get(lista.size()-1));
		
//		String str="this ;is ;a  ;  test";
//		String str1=str.replace(" ", "");
//		System.out.println(str1);
//		StringTokenizer st=new StringTokenizer(str1, ";");
//		System.out.println(st.nextToken()+st.nextToken()+st.nextToken()+st.nextToken());
		
//		HelloWorld.test var=test.tre;
//		System.out.println(var);
//		System.out.println(var.toString());
		
		
//		String pContent="SELECT col2 FROM prova WHERE col1='primariga';";
//		HttpURLConnection connection=null;
//		URL url = new URL("http://192.168.1.16/cgi-bin/post_method.sh");
//		connection=(HttpURLConnection) url.openConnection();
//		connection.setRequestMethod("POST");
//		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//		connection.setRequestProperty("Content-Length", Integer.toString(pContent.getBytes().length));
//		connection.setRequestProperty("Content-Language", "en-US");
//		connection.setUseCaches(false);
//		connection.setDoOutput(true);
//		DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
//		wr.writeBytes(pContent);
//		wr.close();
//		BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//		StringBuffer response = new StringBuffer();
//		String line;
//		while((line = rd.readLine()) != null){
//			response.append(line);
//			response.append('\r');
//		}
//		
//		System.out.println(response);
//		
//		System.out.println(Inet4Address.getLocalHost().getHostAddress());
		
//		System.setProperty("javax.net.ssl.trustStore", "/Users/antonio/Desktop/Eclipse/CERTIFICATI/certificato.jks");
//		Document doc = Jsoup.connect("https://ipeer.auron.co.uk/launchschedule/").get();
////		System.out.println(doc.data());
//		Elements ps = doc.select("body ");
//		System.out.println(ps.text());
//		
//		WebClient webClient = new WebClient();
//		webClient.getOptions().setUseInsecureSSL(true);
//	    Page page = webClient.getPage("http://now.howstuffworks.com/2016/04/13/inspiring-science-quotes?hsw=facebook&utm_campaign=sf&utm_source=facebook.com&utm_medium=social");
//	    WebResponse response = page.getWebResponse();
//	    String content = response.getContentAsString();
//	    System.out.println(content);
		WebDriver driver = new HtmlUnitDriver();

		driver.get("https://www.google.com");

		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("Hello");


		driver.quit();
	}
}
