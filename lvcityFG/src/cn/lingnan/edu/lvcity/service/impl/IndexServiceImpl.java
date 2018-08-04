package cn.lingnan.edu.lvcity.service.impl;

import java.sql.Connection;
import java.util.List;

import cn.lingnan.edu.lvcity.common.DBUtils;
import cn.lingnan.edu.lvcity.dao.impl.ArticleDaoImpl;
import cn.lingnan.edu.lvcity.dao.impl.BanarDaoImpl;
import cn.lingnan.edu.lvcity.dao.impl.FoodDaoImpl;
import cn.lingnan.edu.lvcity.dao.impl.ScenicDaoImpl;
import cn.lingnan.edu.lvcity.dao.inter.ArticleDao;
import cn.lingnan.edu.lvcity.dao.inter.BanarDao;
import cn.lingnan.edu.lvcity.dao.inter.FoodDao;
import cn.lingnan.edu.lvcity.dao.inter.ScenicDao;
import cn.lingnan.edu.lvcity.factory.DaoFactory;
import cn.lingnan.edu.lvcity.model.ArticleDTO;
import cn.lingnan.edu.lvcity.model.BanarDTO;
import cn.lingnan.edu.lvcity.model.FoodDTO;
import cn.lingnan.edu.lvcity.model.ScenicDTO;
import cn.lingnan.edu.lvcity.service.inter.IndexServiceInter;

/**
 * 首页内容获取service实现类
 * @author Administrator
 *
 */
public class IndexServiceImpl implements IndexServiceInter {

	/**
	 * 创建单例对象
	 */
	private static IndexServiceImpl service = new IndexServiceImpl();
	
	/**
	 * 构造器私有化，单例
	 */
	private IndexServiceImpl() {
		
	}
	
	/**
	 * 获取service对象
	 * @return service对象
	 */
	public static IndexServiceImpl getInstance() {
		return service;
	}
	
	@Override
	public List<BanarDTO> findBanar() {
		Connection connection = null;
		BanarDao banarDao = null;
		
		try {
			connection = DBUtils.getConnection();
			banarDao = DaoFactory.getDao(BanarDaoImpl.class, connection);
			return banarDao.findBanar();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection(connection);
		}
		return null;
	}

	@Override
	public List<ArticleDTO> findIndexArticle() {
		Connection connection = null;
		ArticleDao articleDao = null;
		
		try {
			connection = DBUtils.getConnection();
			articleDao = DaoFactory.getDao(ArticleDaoImpl.class, connection);
			return articleDao.findIndexArticle();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection(connection);
		}
		return null;
	}

	@Override
	public List<ScenicDTO> findIndexScenic() {
		Connection connection = null;
		ScenicDao scenicDao = null;
		
		try {
			connection = DBUtils.getConnection();
			scenicDao = DaoFactory.getDao(ScenicDaoImpl.class, connection);
			return scenicDao.findIndexScenic();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection(connection);
		}
		return null;
	}

	@Override
	public List<FoodDTO> findIndexFood() {
		Connection connection = null;
		FoodDao foodDao = null;
		
		try {
			connection = DBUtils.getConnection();
			foodDao = DaoFactory.getDao(FoodDaoImpl.class, connection);
			return foodDao.findIndexFood();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection(connection);
		}
		return null;
	}

}
