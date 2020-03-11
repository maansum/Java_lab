# Lab: 5

# Title: WAP to merge the content of two .txt file in the third .txt file.

## Theory:
   The java.io package contains nearly every class you might ever need to 
   perform input and output (I/O) in Java. All these streams represent an input 
   source and an output destination. The stream in the java.io package supports many data such as 
   primitives, object, localized characters, etc.

- Stream
  A stream can be defined as a sequence of data. There are two kinds of Streams −

  InPutStream − The InputStream is used to read data from a source.

OutPutStream − The OutputStream is used for writing data to a destination.

![](https://www.tutorialspoint.com/java/images/streams.png)

Streams
Java provides strong but flexible support for I/O related to files and networks but
 this tutorial covers very basic functionality related to streams and I/O.

![](https://www.tutorialspoint.com/java/images/file_io.jpg)

1. FileInputStream
    This stream is used for reading data from the files. Objects can be created 
    using the keyword new and there are several types of constructors available.

2. FileOutputStream

   FileOutputStream is used to create a file and write data into it. The stream would create a file,
    if it doesn't already exist, before opening it for output.

_syntaxs_
 
 > OutputStream f = new FileOutputStream("C:/java/hello")

> InputStream f = new FileInputStream("C:/java/hello")

**code**


```
import java.io.*; 
  
public class FileMerge  
{ 
    public static void main(String[] args) throws IOException  
    { 
        // PrintWriter object for file3.txt 
        PrintWriter pw = new PrintWriter("file3.txt"); 
        String str ="aaa";
          
        // BufferedReader object for file1.txt 
        BufferedReader br = new BufferedReader(new FileReader("file1.txt")); 
          br. Write(str);
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
          br. Write(str1);
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
```  

------------------------------------------------------------------------------------------------------------------------------

## code for alternately merging the text:1

_code_

```
import java.io.*; 
  
public class FileMergeAlt  
{ 
    public static void main(String[] args) throws IOException  
    { 
        // PrintWriter object for file3.txt 
        PrintWriter pw = new PrintWriter("file3.txt"); 
          
        // BufferedReader object for file1.txt 
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt")); 
        BufferedReader br2 = new BufferedReader(new FileReader("file2.txt")); 
          
          
        String line1 = br1.readLine(); 
        String line2 = br2.readLine(); 
          
        // loop to copy lines of  
        // file1.txt and file2.txt  
        // to  file3.txt alternatively 
        while (line1 != null || line2 !=null) 
        { 
            if(line1 != null) 
            { 
                pw.println(line1); 
                line1 = br1.readLine(); 
            } 
              
            if(line2 != null) 
            { 
                pw.println(line2); 
                line2 = br2.readLine(); 
            } 
        } 
      
        pw.flush(); 
          
        // closing resources 
        br1.close(); 
        br2.close(); 
        pw.close(); 
          
        System.out.println("Merged file1.txt and file2.txt  alternatively into file3.txt"); 
    } 
}
```

## conclusion:
   we can easily create the file in java with java io.
   
 


 


