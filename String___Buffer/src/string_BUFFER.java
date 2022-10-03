
public class string_BUFFER
{
	 public static void main(String args[])
	    {
	        StringBuffer sb = new StringBuffer("hi nesara");
	        sb.append("Java"); // now original string is changed
	        System.out.println(sb);
	        // Now above  string is changed
	        sb.insert(1, "Java");
	        System.out.println(sb);
	        //now above string is replaced
	        sb.replace(1,3, "python"); 
	        System.out.println(sb);
	        //to delete
	        sb.delete(1,3); 
	        System.out.println(sb);
	        // to reverse the above string
	        sb.reverse();
	        System.out.println(sb);
	        System.out.println(sb.capacity()); // default capacity of string buffer is 16
	        
	    }
}
