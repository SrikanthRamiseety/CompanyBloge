package com.spaneos.sp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spaneos.sp.Dao.BirthdayImp;
import com.spaneos.sp.Dao.BrithDayInf;
import com.spaneos.sp.Dao.DaoImp;
import com.spaneos.sp.Dao.FeedbackImp;
import com.spaneos.sp.Dao.FeedbackInf;
import com.spaneos.sp.Dao.IrpInformation;
import com.spaneos.sp.Dao.SpDao;
import com.spaneos.sp.Dao.SpDaoImp;
import com.spaneos.sp.pojo.BirthDay;
import com.spaneos.sp.pojo.Feedback;
import com.spaneos.sp.pojo.Placement;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user/*")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SpDao dao = new SpDaoImp();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String uri = req.getRequestURI();
		if (uri.endsWith("placement")) {
			List<Placement> plist = dao.getAllPlacements();
			req.setAttribute("placementlist", plist);
			 
			req.getRequestDispatcher("../viewplacement.jsp").forward(req, resp);

		} else if (uri.endsWith("brithday")) {
			List<BirthDay> birthday = new ArrayList<BirthDay>();
			BrithDayInf dayInf = new BirthdayImp();
			List<BirthDay> list = dayInf.getAllDetiles();
			 
			Date Date = new Date();
			int month1 = Date.getMonth();
			int date = Date.getDate();

			 
			for (BirthDay days : list) {

				int month = days.getDate().getMonth();

				int day = days.getDate().getDate();
				if (month + 1 == month1 + 1 && day == date) {
					birthday.add(days);

				}

			}
			 req.setAttribute("birthday", birthday);
			  
			 req.getRequestDispatcher("../brithdayview.jsp").forward(req, resp);
			
		}
		else if (uri.endsWith("irpNews")) {
			List<IrpInformation> lObjects = new ArrayList<>();
			 
			lObjects = new DaoImp().viewDetail();
			req.setAttribute("lObjects", lObjects);
			req.getRequestDispatcher("../viewirp.jsp").forward(req, resp);
		}
		else if(uri.endsWith("feedback")){
			FeedbackInf inf=new FeedbackImp();
			List<Feedback> flist=inf.getAllFeedback();
			req.setAttribute("flist",flist);
		 
			req.getRequestDispatcher("../viewfeedback.jsp").forward(req, resp);
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
