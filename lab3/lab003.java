class parent
    {
    	void you()
    	{
    		System.out.println("responsiblility");
    	}
    }  

    class child extends parent
    {
    	void wish()
    	{
    		System.out.println("its me ");
       }
    
}  

    class TestInheritance 
     { 
    	public static void main(String args[]){  
    child d = new child();  
    	  d.you();  
    	  d.wish();  
    	  }
    	}