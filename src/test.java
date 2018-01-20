import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File info = new File("c:/url.txt");
		
		try{
		FileReader read = new FileReader(info);
		BufferedReader buff = new BufferedReader(read);
		String aLine = "";
		
		while((aLine=buff.readLine())!=null){
			String rule1 = "http(s)?://([\\w-]+\\.)+[\\w-]+(//[\\w- .//?%&=]*)?";
			String rule2 = "[\u4e00-\u9fa5]+";
			
			Pattern p2 = Pattern.compile(rule2);
			Matcher m2 = p2.matcher(aLine);
			
			Pattern p1 = Pattern.compile(rule1);
			Matcher m1 = p1.matcher(aLine);

			while(m2.find()&&m1.find()){
			//	System.out.println("mached");
				System.out.println(m2.group()+":"+"\t\t"+m1.group());
			}
		}
		buff.close();
		read.close();
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	

}
