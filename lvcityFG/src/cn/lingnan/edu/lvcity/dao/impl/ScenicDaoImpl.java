package cn.lingnan.edu.lvcity.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

import cn.lingnan.edu.lvcity.dao.inter.ScenicDao;
import cn.lingnan.edu.lvcity.model.ScenicDTO;

/**
 * 风景类接口的实现类
 * @author Administrator
 *
 */
public class ScenicDaoImpl extends DaoImplement<ScenicDTO> implements ScenicDao {

	/**
	 * 数据库连接
	 */
	private Connection connection = null;
	
	/**
	 * 构造方法，初始化数据库连接
	 * @param connection 数据库连接
	 */
	public ScenicDaoImpl(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public List<ScenicDTO> findIndexScenic() {
		String sql = "select * from scenic";
		try {
			return this.getForList(connection, sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
