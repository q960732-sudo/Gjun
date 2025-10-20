package vo.dao;

import java.util.List;

import vo.Allpordermessage;

//只限查詢--->select
public interface AllpordermessageDao {
	//全部
	
	List<Allpordermessage> selectAll();
	
	List<Allpordermessage> selectByEmployeename(String EmployeeName);
	List<Allpordermessage> selectByProductname(String productName);
	List<Allpordermessage> selectByMemberAddress(String memberAddress);

}
