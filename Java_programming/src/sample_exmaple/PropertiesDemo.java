package sample_exmaple;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

public class PropertiesDemo 
{
  static WebDriver driver;
  static Properties p;
  
  public static Properties properties() throws IOException
  {
	  FileReader file=new FileReader(System.getProperty("user.dir")+"//Testdata//PropertyFile.properties");
	  p=new Properties();
	  p.load(file);
	  return p;
  }
  
  public static Properties getproperties() throws IOException
  {
	  p=properties();
	  return p;
  }
  
  public static void printpropeties() throws IOException
  {
	  p=getproperties();
	  String url=p.getProperty("URL");
	  System.out.println(url);
	  String name=p.getProperty("name");
	  System.out.println(name);
	  String surname=p.getProperty("surname");
	  System.out.println(surname);
  }
  public static void main(String[] args) throws IOException
  {
	  PropertiesDemo pd=new PropertiesDemo();
	  pd.printpropeties();
  }
	
}
