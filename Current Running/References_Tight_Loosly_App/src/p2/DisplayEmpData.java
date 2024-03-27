package p2;
import p1.*;

public class DisplayEmpData {
	public EmpData ed;
	
	public DisplayEmpData(EmpData ed)
	{
		this.ed = ed;
	}
	
	public void display()
	{
		ed.getEmpData();
		ed.ec.getEmpContact();
		ed.es.getEmpSalary();
	}
}
