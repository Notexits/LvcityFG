package cn.lingnan.edu.lvcity.dao.inter;

import java.util.List;

import cn.lingnan.edu.lvcity.model.BanarDTO;

/**
 * 广告接口类
 * @author Administrator
 *
 */
public interface BanarDao extends BaseDao {
	
	/**
	 * 获取广告大图 
	 * @return 返回广告图对象的结果集
	 */
	public List<BanarDTO> findBanar();
	
	/**
	 * 根据传入的信息模糊查找符合的记录
	 * @param searchInfo 查找信息
	 * @return 返回符合条件的记录结果集
	 */
	public List<BanarDTO> blurredSearchBanar(String searchInfo);
	
	/**
	 * 根据 Id 获取广告图对象
	 * @param id 广告图 id
	 * @return 返回一个符合条件的广告图对象
	 */
	public BanarDTO findBanarById(int id);
	
	/**
	 * 插入一条广告图记录
	 * @param banar 需要插入的广告图的所有信息对象
	 * @return 返回插入的结果
	 */
	public boolean addBanar(BanarDTO banar);
	
	/**
	 * 根据 id 删除广告图记录
	 * @param id 广告图 id
	 * @return 返回删除的结果
	 */
	public boolean deleteBanarById(int id);
	
	/**
	 * 更新广告图记录
	 * @param banar 更新广告图的所有信息对象
	 * @return 返回更新的结果
	 */
	public boolean updateBanar(BanarDTO banar);
	
}
