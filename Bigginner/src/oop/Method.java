package oop;

public class Method {
    int rollno;
    String name;
    
    void insertRecord(int r,String n){
    	rollno = r;
    	name = n;
    }
    
    void displayInfo() {
    	System.out.println(rollno +" "+name);

    }
}
    class TestStudent{
    	
    	public static void main(String[] args) {
    		 Method s1 =new Method();
      	     Method s2 =new Method();
      	     
      	     s1.insertRecord(001, "falih");
      	     s2.insertRecord(002, "athul");
      	     
      	     s1.displayInfo();
      	     s2.displayInfo();
      	     
		}
    	 
    }
 
   
   
