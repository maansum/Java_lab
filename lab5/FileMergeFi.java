import java.io.*; 
  
public class FileMergeFi 
{ 
    public static void main(String[] args) throws IOException  
    { 
        // PrintWriter object for file3.txt 
        PrintWriter pw = new PrintWriter("file3.txt"); 
        String str ="aaa";
          
        // BufferedReader object for file1.txt 
        BufferedReader br = new BufferedReader(new FileReader("file1.txt")); 
          // br.Write(str);
        String line = br.readLine(); 
          
        // loop to copy each line of  
        // file1.txt to  file3.txt 
        while (line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          String str1 ="111";
        br = new BufferedReader(new FileReader("file2.txt")); 
         //br. FileWrite(str1);
        line = br.readLine(); 
          
        // loop to copy each line of  
        // file2.txt to  file3.txt 
        while(line != null) 
        { 
            pw.println(line); 
            line = br.readLine(); 
        } 
          
        pw.flush(); 
          
        // closing resources 
        br.close(); 
        pw.close(); 
          
        System.out.println("Merged file1.txt and file2.txt into file3.txt"); 
    } 
} 