package P7_StandaloneCollections;

import java.util.Set;

public class Ex3_Set {
	
	Set<Integer> pincode;

	public Ex3_Set() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ex3_Set(Set<Integer> pincode) {
		super();
		this.pincode = pincode;
	}

	public Set<Integer> getPincode() {
		return pincode;
	}

	public void setPincode(Set<Integer> pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Ex3_Set [pincode=" + pincode + "]";
	}
	
	

}
