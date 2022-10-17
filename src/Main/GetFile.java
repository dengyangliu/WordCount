package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class GetFile {
	//获取output.txt的内容
		public static String getFileContent(){
			File file = new File("E:/output.txt");
			StringBuilder result = new StringBuilder();
			try{
			    BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
			    String res = null;
			    while((res = bufferedreader.readLine())!=null){
			        result.append(System.lineSeparator()+res);
			    }
			     bufferedreader.close();  
			    }catch(Exception e){	
			    	e.printStackTrace();
			    }
			 return result.toString();
			  }

}
