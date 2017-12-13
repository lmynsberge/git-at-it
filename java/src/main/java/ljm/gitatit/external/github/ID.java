package ljm.gitatit.external.github;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * @author lmynsberge
 *
 */
@XmlRootElement
public class ID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _id;

	public ID() {}
	

	@XmlValue
	public String getId() {
		return _id;
	}

	public void setId(String id) {
		_id = id;
	}
}
