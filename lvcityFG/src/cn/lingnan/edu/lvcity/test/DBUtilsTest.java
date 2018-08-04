package cn.lingnan.edu.lvcity.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cn.lingnan.edu.lvcity.common.DBUtils;

class DBUtilsTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetConnection() {
		Connection connection = DBUtils.getConnection();
		
		System.out.println(connection);
		
		DBUtils.closeConnection(connection);
	}

	@Test
	void testCloseConnection() {
		fail("Not yet implemented");
	}

}
