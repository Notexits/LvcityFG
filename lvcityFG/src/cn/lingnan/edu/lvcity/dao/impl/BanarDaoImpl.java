package cn.lingnan.edu.lvcity.dao.impl;

import java.sql.Connection;
import java.util.List;

import cn.lingnan.edu.lvcity.dao.inter.BanarDao;
import cn.lingnan.edu.lvcity.model.BanarDTO;

public class BanarDaoImpl extends DaoImplement<BanarDTO> implements BanarDao {

	Connection connection = null;
	
	public BanarDaoImpl(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public List<BanarDTO> findBanar() {
		String sql = "select * from banar";
		try {
			return this.getForList(connection, sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public List<BanarDTO> blurredSearchBanar(String searchInfo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public BanarDTO findBanarById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean addBanar(BanarDTO banar) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteBanarById(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean updateBanar(BanarDTO banar) {
		// TODO Auto-generated method stub
		return false;
	}

}
