package cn.lingnan.edu.lvcity.dao.impl;

import java.sql.Connection;
import java.util.List;

import cn.lingnan.edu.lvcity.dao.inter.FoodDao;
import cn.lingnan.edu.lvcity.model.FoodDTO;

/**
 * 食品接口的实现类
 * @author Administrator
 *
 */
public class FoodDaoImpl extends DaoImplement<FoodDTO> implements FoodDao {

	/**
	 * 数据库连接
	 */
	private Connection connection = null;
	
	/**
	 * 构造器，初始化数据库连接connection
	 * @param connection 数据库连接
	 */
	public FoodDaoImpl(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public List<FoodDTO> findIndexFood() {
		String sql = "select * from food";
		
		try {
			return this.getForList(connection, sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
