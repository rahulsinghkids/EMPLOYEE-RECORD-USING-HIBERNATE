package rahul;

import javax.persistence.*;

@Entity
public class employee 
{
	@Id
	private int EID;
	private String EName;
	private String DOJ;
	private String YOE;
	private String Designation;
	
	public employee() {}

	public employee(int eID, String eName, String dOJ, String yOE, String designation) 
	{
	
		EID = eID;
		EName = eName;
		DOJ = dOJ;
		YOE = yOE;
		Designation = designation;
	}

	public int getEID() {
		return EID;
	}

	public void setEID(int eID) {
		EID = eID;
	}

	public String getEName() {
		return EName;
	}

	public void setEName(String eName) {
		EName = eName;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}

	public String getYOE() {
		return YOE;
	}

	public void setYOE(String yOE) {
		YOE = yOE;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	@Override
	public String toString() {
		return "employee [EID=" + EID + ", EName=" + EName + ", DOJ=" + DOJ + ", YOE=" + YOE + ", Designation="
				+ Designation + "]";
	}
	
	
	
	
	

}
