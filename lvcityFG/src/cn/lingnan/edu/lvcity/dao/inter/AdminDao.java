package cn.lingnan.edu.lvcity.dao.inter;

import java.util.List;

import cn.lingnan.edu.lvcity.model.AdminDTO;

public interface AdminDao extends BaseDao {
	
	/**
	 * 查询所有的管理员
	 * @return 返回所有的管理员信息的结果集
	 */
	public List<AdminDTO> findAllAdmin();
	
	/**
	 * 根据管理员名字查找管理员信息
	 * @param name 管理员名字
	 * @return 返回名字为 name 的管理员对象
	 */
	public AdminDTO findAdminByName(String name);
	
	/**
	 * 根据管理员 Id 查找管理员信息
	 * @param id 管理员的 id
	 * @return 返回 编号为 id 的管理员对象
	 */
	public AdminDTO findAdminById(int id);
	
	/**
	 * 根据用户名和密码进行登录操作
	 * @param name 用户名
	 * @param password 密码
	 * @return 返回登录成功的用户对象
	 */
	public AdminDTO login(String name, String password);
	
	/**
	 * 更新管理员信息
	 * @param adminDTO 更新的信息对象
	 * @return 返回更新的结果
	 */
	public boolean updateAdmin(AdminDTO adminDTO);
	
	/**
	 * 添加管理员
	 * @param adminDTO 需要添加的管理员对象
	 * @return 返回添加的结果
	 */
	public boolean addAdmin(AdminDTO adminDTO);
	
	/**
	 * 根据用户 id 进行删除管理员信息
	 * @param id 管理员编号
	 * @return 返回删除的结果
	 */
	public boolean deleteAdmin(int id);
}
