package vo.service.impl;

import java.util.List;

import po.Employee;
import vo.Allpordermessage;
import vo.dao.impl.AllpordermessageDaoImpl;
import vo.service.AllordermessageService;



public class AllpordermessageServiceImpl implements AllordermessageService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static final AllpordermessageDaoImpl ad=new AllpordermessageDaoImpl();

	@Override
	public List<Allpordermessage> findByEmployeeNameOfPorder(String EmployeeName) {
		// TODO Auto-generated method stub
		return ad.selectAll();
	}
	

	
}
