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