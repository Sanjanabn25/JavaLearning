package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile extends FileWalker
{
  public void Read(String args)
  {
	  File f1=new File(args);
	   FileReader fr=null;
	     try {
			fr=new FileReader(f1);
			int a;
			
				a = fr.read();
			while(a!=1)
			{
				System.out.println((char)a);
			
					a=fr.read();
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     catch(IOException e)
	     {
	    	 e.printStackTrace();
	     }
			
}
}

