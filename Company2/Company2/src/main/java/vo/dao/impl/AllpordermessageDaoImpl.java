package vo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DbConnection;
import vo.Allpordermessage;
import vo.dao.AllpordermessageDao;

public class AllpordermessageDaoImpl implements AllpordermessageDao{

	public static void main(String[] args) {
		//List<Allpordermessage> list=new AllpordermessageDaoImpl().selectAll();
		//List<Allpordermessage> list=new AllpordermessageDaoImpl().selectByEmployeename("john");
		//List<Allpordermessage> list=new AllpordermessageDaoImpl().selectByMemberAddress("台北");
		List<Allpordermessage> list=new AllpordermessageDaoImpl().selectByProductname("lcd");
		for(Allpordermessage all:list)
		{
			System.out.println(all.getPorderNo()+
					"\t"+all.getMemberName()+
					"\t"+all.getProductAmount()+
					"\t"+all.getEmployeeName()+
					"\t"+all.getProductAmount()+
					"\t"+all.getSum()+
					"\t"+all.getMemberAddress());
		}

	}
	
	Connection conn=DbConnection.getDb();

	@Override
	public List<Allpordermessage> selectAll() {
		String Sql="select * from allpordermessage";
		List<Allpordermessage> list=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(Sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Allpordermessage all=new Allpordermessage();
				all.setPorderNo(rs.getString("porderno"));
				all.setMemberName(rs.getString("memberName"));
				all.setProductName(rs.getString("productName"));
				all.setEmployeeName(rs.getString("employeeName"));
				all.setProductAmount(rs.getInt("productAmount"));
				all.setSum(rs.getInt("sum"));
				all.setMemberAddress(rs.getString("memberAddress"));
				list.add(all);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Allpordermessage> selectByEmployeename(String EmployeeName) {
		String Sql="select * from allpordermessage where employeename=?";
		List<Allpordermessage> list=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(Sql);
			ps.setString(1, EmployeeName);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Allpordermessage all=new Allpordermessage();
				all.setPorderNo(rs.getString("porderno"));
				all.setMemberName(rs.getString("memberName"));
				all.setProductName(rs.getString("productName"));
				all.setEmployeeName(rs.getString("employeeName"));
				all.setProductAmount(rs.getInt("productAmount"));
				all.setSum(rs.getInt("sum"));
				all.setMemberAddress(rs.getString("memberAddress"));
				list.add(all);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Allpordermessage> selectByProductname(String productName) {
		String Sql="select * from allpordermessage where productname=?";
		List<Allpordermessage> list=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(Sql);
			ps.setString(1, productName);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Allpordermessage all=new Allpordermessage();
				all.setPorderNo(rs.getString("porderno"));
				all.setMemberName(rs.getString("memberName"));
				all.setProductName(rs.getString("productName"));
				all.setEmployeeName(rs.getString("employeeName"));
				all.setProductAmount(rs.getInt("productAmount"));
				all.setSum(rs.getInt("sum"));
				all.setMemberAddress(rs.getString("memberAddress"));
				list.add(all);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<Allpordermessage> selectByMemberAddress(String memberAddress) {
		String Sql="select * from allpordermessage where memberaddress=?";
		List<Allpordermessage> list=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(Sql);
			ps.setString(1, memberAddress);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Allpordermessage all=new Allpordermessage();
				all.setPorderNo(rs.getString("porderno"));
				all.setMemberName(rs.getString("memberName"));
				all.setProductName(rs.getString("productName"));
				all.setEmployeeName(rs.getString("employeeName"));
				all.setProductAmount(rs.getInt("productAmount"));
				all.setSum(rs.getInt("sum"));
				all.setMemberAddress(rs.getString("memberAddress"));
				list.add(all);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
