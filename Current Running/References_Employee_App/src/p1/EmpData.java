package p1;

public class EmpData {
	public String id;
	public String name;
	public String desg;
	
	public EmpContact ec = new EmpContact();
	public EmpSalary es = new EmpSalary();
	
	public void getEmpData() {
		System.out.println("***EmpData***");
		System.out.println("Emp-Id:"+id);
		System.out.println("Emp-Name:"+name);
		System.out.println("Emp-Designation:"+desg);
	}

}
