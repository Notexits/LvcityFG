package cn.lingnan.edu.lvcity.dao.impl;

import java.sql.Connection;
import java.util.List;

import cn.lingnan.edu.lvcity.dao.inter.ArticleDao;
import cn.lingnan.edu.lvcity.model.ArticleDTO;

public class ArticleDaoImpl extends DaoImplement<ArticleDTO> implements ArticleDao {

	Connection connection = null;
	
	public ArticleDaoImpl(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public List<ArticleDTO> findIndexArticle() {
		String sql = "select * from article";
		
		try {
			return this.getForList(connection, sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArticleDTO findArticleById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArticleDTO> blurredSearcherArticle(String searchInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addArticle(ArticleDTO articleDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteArticle(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateArticle(ArticleDTO articleDTO) {
		// TODO Auto-generated method stub
		return false;
	}

}
