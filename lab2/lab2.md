  # Lab: Constructors in java


 # Theory:
      Constructors are the blocks of codes. that are similar to the methods. It is created when the the instance of 
the class is created.constructor are called when the object is defined. 


      Types of constructors:

      1.__Default constructor__
      2. __Parameterized constructor__

   ## Default constructor

  The constructor that don't contains the arguments. The default value is 0.

 >code

 ``` 
     class defaultConstructor
     {
     	int a;
     	int b;
     	defaultConstructor(){
     		a=10;
     		b=20;
     	}
     	 public void add()
     	 {
     	 	int sum;
     	 	sum=a+b;
     	 	System.out.println(sum);

     	 }
     	 public static void main(String []arg)
     	 {
     	 	defaultConstructor c1 = new defaultConstructor();
     	 	c1.add();
     	 }
     }

   ```

 
     ## parameterize constructor:

     A constructor is called Parameterized Constructor when it accepts a specific number of parameters. 
To initialize data members of a class with distinct values. ... With a parameterized constructor for a class, 
one must provide initial values as arguments, otherwise, the compiler reports an error.
 
 >code:

 ```
    
    class parameterizeConstructor
     {
     	int a;
     	int b;
     	parameterizeConstructor(int a,int b){
     		this.a=a;
     		this.b=b;
     	}
     	 public void add()
     	 {
     	 	int sum;
     	 	sum=a+b;
     	 	System.out.println(sum);

     	 }
     	 public static void main(String []arg)
     	 {
     	 	parameterizeConstructor c1 = new parameterizeConstructor(10,20);
     	 	c1.add();
     	 }
     }

```

# conclusion:

 In this way we can assign the value to the variable using different types of constructor.