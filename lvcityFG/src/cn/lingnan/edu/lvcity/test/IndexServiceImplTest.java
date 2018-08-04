package cn.lingnan.edu.lvcity.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cn.lingnan.edu.lvcity.model.BanarDTO;
import cn.lingnan.edu.lvcity.service.impl.IndexServiceImpl;
import cn.lingnan.edu.lvcity.service.inter.IndexServiceInter;

class IndexServiceImplTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testFindBanar() {
		IndexServiceInter serviceInter = IndexServiceImpl.getInstance();
		
		List<BanarDTO> list = serviceInter.findBanar();
		for(BanarDTO baner : list) {
			System.out.println(baner);
		}
		
	}

	@Test
	void testFindIndexArticle() {
		fail("Not yet implemented");
	}

	@Test
	void testFindIndexScenic() {
		fail("Not yet implemented");
	}

	@Test
	void testFindIndexFood() {
		fail("Not yet implemented");
	}

}
