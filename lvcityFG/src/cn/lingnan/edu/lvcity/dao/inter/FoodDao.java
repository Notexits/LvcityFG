package cn.lingnan.edu.lvcity.dao.inter;

import java.util.List;

import cn.lingnan.edu.lvcity.model.FoodDTO;

public interface FoodDao extends BaseDao {
	
	/**
	 * 获取美食图片
	 * @return 返回美食图片对象的结果集
	 */
	public List<FoodDTO> findIndexFood();
	
}
