package cn.lingnan.edu.lvcity.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


/**
 * 获取与释放数据库连接
 * @author Administrator
 *
 */
public class DBUtils {

//	/**
//	 * 数据源
//	 */
//	public static DataSource dataSource = null;
//	
//	/**
//	 * 初始化数据源
//	 */
//	static {
//		dataSource = new ComboPooledDataSource("helloc3p0");
//	}
//	
//	/**
//	 * 获取数据库链接
//	 * @return 返回一个 Connection 对象
//	 */
//	public static Connection getConnection(){
//		Connection connection = null;
//		try {
//			connection = dataSource.getConnection();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return connection;
//	}
//	
//	/**
//	 * 设置事务提交方式为手动提交
//	 * @param connection 数据库连接对象
//	 */
//	public static void setCommit(Connection connection){
//		if(connection != null) {
//			try {
//				connection.setAutoCommit(false);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	/**
//	 * 提交事务
//	 * @param connection 数据库连接对象
//	 */
//	public static void putCommit(Connection connection) {
//		if(connection != null) {
//			try {
//				connection.commit();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	/**
//	 * 回滚事务
//	 * @param connection 数据库连接对象
//	 */
//	public static void rollbackTransaction(Connection connection) {
//		if(connection != null) {
//			try {
//				connection.rollback();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//	
//	/**
//	 * 依次释放ResultSet， Statement 数据库链接
//	 * @param statement SQL语句执行对象
//	 * @param rs 结果集对象
//	 */
//	public static void closeStatement(Statement statement, ResultSet rs) {
//
//		try {
//			if(rs != null) {
//				rs.close();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			if(statement != null) {
//				statement.close();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	/**
//	 * 关闭数据库连接
//	 * @param connection 数据库连接
//	 */
//	public static void closeConnection(Connection connection) {
//		try {
//			if(connection != null) {
//				connection.close();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * 获取数据库连接
	 */
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/lvcitydb";
			String user = "root";
			String password = "root";
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServiceException("Can not get connection", e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new ServiceException("Can not get connection", e);
		}
		
		/*	         1.加载jdbc驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2.定义连接url
		String url = "jdbc:oracle:thin:@localhost:1521:neuedu";
		//3.获取数据库连接    
		Connection conn = DriverManager.getConnection(url,"scott","tiger");*/
		
		/*try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context
					.lookup("java:comp/env/jdbc/lvcity");
			conn = ds.getConnection();
			System.out.println("connect sucess!");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			throw new ServiceException("Can not get connection", e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new ServiceException("Can not get connection", e);
		}
*/
		return conn;
	}

	/**
	 * 开启事务
	 * 
	 * @param conn
	 */
	public static void beginTransaction(Connection conn) {
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			throw new ServiceException("Can not begin transaction", e);
		}
	}

	/**
	 * 提交事务
	 * 
	 * @param conn
	 */
	public static void commit(Connection conn) {
		try {
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			throw new ServiceException("Can not commit transaction", e);
		}
	}

	/**
	 * 回滚事务
	 * 
	 * @param conn
	 */
	public static void rollback(Connection conn) {
		try {
			conn.rollback();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			throw new ServiceException("Can not rollback transaction", e);
		}
	}

	/**
	 * 关闭连接
	 * 
	 * @param conn
	 */
	public static void closeConnection(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			throw new ServiceException("Can not close connection", e);
		}
	}

	/**
	 * 关闭statement
	 * 
	 * @param stmt
	 */
	public static void closeStatement(Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			throw new ServiceException("Can not close statement", e);
		}
	}
}