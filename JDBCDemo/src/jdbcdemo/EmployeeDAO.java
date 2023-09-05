package jdbcdemo;

import java.util.List;
public interface EmployeeDAO {
	public Emp findByID(int eno)throws Exception;
	public Emp findByEname(String ename)throws Exception;
	public List<Emp> findAll()throws Exception;
	public int createEmployee(Emp emp)throws Exception;
	public int updateEmployee(Emp emp)throws Exception;
	public int deleteEmployeeByID(int eno)throws Exception;
	public int deleteEmployeeByName(String ename)throws Exception;
}