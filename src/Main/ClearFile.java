package Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ClearFile {
	//清空文件
		public static void clearFile(){
			File file = new File("E:/output.txt");
			FileWriter filewriter;
			try {
				filewriter = new FileWriter (file);
				filewriter.write("");
				filewriter.flush();
				filewriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
}
