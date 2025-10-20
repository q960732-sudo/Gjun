package vo.service;

import java.util.List;


import vo.Allpordermessage;

public interface AllordermessageService {
	
	List<Allpordermessage> findByEmployeeNameOfPorder(String EmployeeName);

}
