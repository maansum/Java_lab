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