package test;

import org.apache.deltaspike.security.api.authorization.Secures;

public class CustomAuthorizer {
	   
	@Secures
	
    public boolean check4() {
        return true;
    }

}
