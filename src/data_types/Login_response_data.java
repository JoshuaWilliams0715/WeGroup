package data_types;


// Do we need this?
// Will only be necessary if all users need to talk on
// their own ports

// Look into non open port and tickets?
// If it's not too hard look into it

public class Login_response_data extends Base_data 
{
	// Default constructor
	public Login_response_data()
	{
		super();
		m_type = Tcp_message_type.Login_response;
		
		m_accpted = false;
		m_port_number = 0;
	}
	
	// Required for Serializable
	private static final long serialVersionUID = 1L;
	
	// Was login accepted
	public boolean m_accpted;
	
	// What port to start talking on
	// This should be ignored by the UI
	public int m_port_number;
}
