import java.util.Hashtable;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;

public class TestJNDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable hashtableEnvironment = new Hashtable<>();
		hashtableEnvironment.put(Context.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.fscontext.RefFSContextFactory");
		hashtableEnvironment.put(Context.PROVIDER_URL, args[0]);
		
		try {
			Context context = new InitialContext(hashtableEnvironment);
			
			if(args.length == 1) {
				NamingEnumeration namingEnumeration = context.listBindings("");
				while(namingEnumeration.hasMore()) {
					Binding binding = (Binding) namingEnumeration.next();
					System.out.println(binding.getName() + " " + binding.getObject());
				}
			}
			
			context.close();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
