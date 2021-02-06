package es.manzano.examenestic.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;




@ManagedBean
/**
 * <p>UserSessionBean class.</p>
 *
 */
@SessionScoped
public class UserSessionBean implements Serializable {
	private static final long serialVersionUID = 1L;
	//private static final Logger logger = LoggerFactory.getLogger(UserSessionBean.class);
	
	String username;

	@PostConstruct
	    private void init() {	  
		  reset();
	    }

	/**
	 * <p>reset.</p>
	 */
	public void reset()
	{
	}
	
	/**
	 * <p>Getter for the field <code>username</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <p>Setter for the field <code>username</code>.</p>
	 *
	 * @param username a {@link java.lang.String} object.
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	
	  
	}
