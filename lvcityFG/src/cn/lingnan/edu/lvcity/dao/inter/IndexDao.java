package cn.lingnan.edu.lvcity.dao.inter;

import java.util.List;

import cn.lingnan.edu.lvcity.model.ArticleDTO;
import cn.lingnan.edu.lvcity.model.BanarDTO;
import cn.lingnan.edu.lvcity.model.FoodDTO;
import cn.lingnan.edu.lvcity.model.ScenicDTO;

/**
 * 获取主页各个内容资源的接口Dao
 * @author Administrator
 *
 */
public interface IndexDao extends BaseDao {
	
	/**
	 * 获取广告大图 
	 * @return 返回广告图对象的结果集
	 */
	public List<BanarDTO> findBanar();
	
	/**
	 * 获取首页文章
	 * @return 返回文章对象的结果集
	 */
	public List<ArticleDTO> findIndexArticle();
	
	/**
	 * 获取风景图片
	 * @return 返回风景图片对象的结果集
	 */
	public List<ScenicDTO> findIndexScenic();
	
	/**
	 * 获取美食图片
	 * @return 返回美食图片对象的结果集
	 */
	public List<FoodDTO> findIndexFood();
}
