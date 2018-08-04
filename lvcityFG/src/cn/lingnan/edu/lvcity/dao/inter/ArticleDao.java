package cn.lingnan.edu.lvcity.dao.inter;

import java.util.List;

import cn.lingnan.edu.lvcity.model.ArticleDTO;

/**
 * 文章接口类
 * @author Administrator
 *
 */
public interface ArticleDao extends BaseDao {
	
	/**
	 * 获取首页文章
	 * @return 返回文章对象的结果集
	 */
	public List<ArticleDTO> findIndexArticle();
	
	/**
	 * 根据文章 id 获取文章信息对象
	 * @param id 文章编号
	 * @return 返回一个文章信息对象
	 */
	public ArticleDTO findArticleById(int id);
	
	/**
	 * 根据传进的查找信息进行模糊查找文章记录
	 * @param searchInfo 需要查找的信息
	 * @return 返回符合添加的文章信息集合
	 */
	public List<ArticleDTO> blurredSearcherArticle(String searchInfo);
	
	/**
	 * 添加文章信息
	 * @param articleDTO 需要添加文章信息
	 * @return 返回删除的结果
	 */
	public boolean addArticle(ArticleDTO articleDTO);
	
	/**
	 * 删除文章信息
	 * @param id 需要删除的文章编号
	 * @return 返回删除的结果
	 */
	public boolean deleteArticle(int id);
	
	/**
	 * 更新文章信息
	 * @param articleDTO 更新信息
	 * @return 返回更新的结果
	 */
	public boolean updateArticle(ArticleDTO articleDTO);
}
