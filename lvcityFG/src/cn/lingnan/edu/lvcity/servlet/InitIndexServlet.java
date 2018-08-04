package cn.lingnan.edu.lvcity.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.lingnan.edu.lvcity.model.ArticleDTO;
import cn.lingnan.edu.lvcity.model.BanarDTO;
import cn.lingnan.edu.lvcity.model.FoodDTO;
import cn.lingnan.edu.lvcity.model.ScenicDTO;
import cn.lingnan.edu.lvcity.service.impl.IndexServiceImpl;
import cn.lingnan.edu.lvcity.service.inter.IndexServiceInter;

/**
 * Servlet implementation class InitIndexServlet
 */
@WebServlet("/User/initIndexServlet")
public class InitIndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		IndexServiceInter serviceInter = IndexServiceImpl.getInstance();
		
		List<BanarDTO> banarList = serviceInter.findBanar();
		
		List<ArticleDTO> articleList = serviceInter.findIndexArticle();
		
		List<ScenicDTO> scenicList = serviceInter.findIndexScenic();
		
		List<FoodDTO> foodList = serviceInter.findIndexFood();
		
		session.setAttribute("banarList", banarList);
		session.setAttribute("articleList", articleList);
		session.setAttribute("scenicList", scenicList);
		session.setAttribute("foodList", foodList);
		System.out.println("aaa");
		response.sendRedirect(request.getContextPath() + "/User/index.jsp");
		System.out.println("12321312");
	}

}
