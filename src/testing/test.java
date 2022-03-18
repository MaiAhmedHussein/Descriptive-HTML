package testing;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import team.Hello;

public class test {
	 private static String path = System.getProperty("user.dir")+"/output.html";
	 public static void create(String content) throws IOException{

	        File html = new File(path);
	        FileWriter fw = new FileWriter(html);
	        fw.write(content);
	        fw.close();

	    }
	 public static String readFile(String path) throws IOException{
	        String html = "";
	        Scanner sc = new Scanner( new File(path));
	        while(sc.hasNextLine()){
	            html += sc.nextLine() + "\n";
	        }
	        return html;
	    }
}