class Task14 {  
public static void main (String argv[]) { 
int x, y;  
boolean Boolean_variable; 
Boolean_variable = true;  
System.out.println("Boolean value = "+ Boolean_variable);  
Boolean_variable = false;  
System.out.println("Boolean value = "+ Boolean_variable);  
x = y = 4;  
Boolean_variable = (x != y);  
System.out.println("Boolean value = "+ Boolean_variable+"(x = "+x+", y = "+y+")");  
Boolean_variable = (x == y);  
System.out.println("Boolean value = "+ Boolean_variable+"(x = "+x+", y = "+y+")");  
}   
}
