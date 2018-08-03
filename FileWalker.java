package Practice;
import java.lang.*;
import java.io.File;
import java.util.Scanner;

public class FileWalker
{
	public void walk(String path)
	{
		File root=new File(path);
		File[] list=root.listFiles();
	       for(File f:list)
	       {
	    	   if(f.isDirectory())
	    	   {
	    		   walk(f.getAbsolutePath());
	    		   System.out.println("dir ="+f.getAbsolutePath());
	    		   System.out.println("File="+f.getAbsoluteFile());
	    	   }
	       }
	}
	public static void main(String[] args)
	{
		try {
			FileWalker fw=new FileWalker();
			fw.walk(args[0]);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{   Scanner sc=new Scanner(System.in);
			System.out.println("enter the File");
			System.out.println(args[0]);
			String path1=sc.toString();
			//ReadFile rd=new ReadFile();
			//rd.Read(path1);
		}
	}
}
