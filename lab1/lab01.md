# LAB-1: DATA TYPE AND ARRAY IN JAVA

# THEORY:

  ## DATA TYPES
Data tyes specifies the different sizes and values that can be stored in the variable.  
It is of two types:

>primitivedata type

  1.boolean data type
  2.byte data type
  3.char data type
  4.short data type
  5.int data type
  6.long data type
  7.float data type
  8.double data type

"Non-primitive data types"
	-classes 
	-Interfaces
	-Arrays

  ARRAY

   An array is a collection of similar type of elements which have a contiguous memory location.It is of two type:
  Single Dimensional Array
  Multidimensional Array


CODES
Single Dimensional Array

```
class Testarray{  
public static void main(String args[]){  
int a[]={33,3,4,5};
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
} 
}
 
``` 

### Output
33\
3\
4\
5

## MultiDimensional Array

```
class Testarray{  
public static void main(String args[]){  
//declaring and initializing 2D array  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
}}  
```

### Output
1 2 3\
2 4 5\
4 4 5
