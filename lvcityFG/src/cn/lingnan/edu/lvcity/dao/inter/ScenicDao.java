package cn.lingnan.edu.lvcity.dao.inter;

import java.util.List;

import cn.lingnan.edu.lvcity.model.ScenicDTO;

public interface ScenicDao extends BaseDao {
	
	/**
	 * 获取风景图片
	 * @return 返回风景图片对象的结果集
	 */
	public List<ScenicDTO> findIndexScenic();
}
