package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.regdao;
import com.dao.regdao1;
import com.vo.regvo;

@Controller
public class controller {

	@Autowired
	regdao d;

	@RequestMapping(value = "/hello.html", method = RequestMethod.GET)
	public ModelAndView insert(HttpServletRequest req) {
		String s = req.getParameter("fn");
		String s1 = req.getParameter("ln");
		String s2 = req.getParameter("mn");

		regvo v = new regvo();
		v.setFn(s);
		v.setLn(s1);
		v.setMn(s2);

		try {
			d.insert(v);
		} catch (Exception e) {

			e.printStackTrace();
		}
		String s3 = "insert done";
		return new ModelAndView("welcome", "msg", s3);

	}

	@Autowired
	regdao1 d1;

	@RequestMapping(value = "/search.html", method = RequestMethod.GET)
	public ModelAndView search(HttpServletRequest req, HttpSession Session) {
		String s = req.getParameter("fn");

		regvo v = new regvo();
		v.setFn(s);
		
			List l = d1.search(v);
			Session.setAttribute("list", l);
		
		//String s4 = "searching done baby!!!";
		return new ModelAndView("welcome1");

	}

	@RequestMapping(value = "/update.html", method = RequestMethod.GET)
	public ModelAndView update(HttpServletRequest req, HttpSession Session) {

		String s = req.getParameter("s1");
		int i = Integer.parseInt(s);

		regvo v = new regvo();
		v.setId(i);

		List l = d1.update(v);

		return new ModelAndView("update", "list", l);

	}

	@RequestMapping(value = "/edit.html", method = RequestMethod.GET)
	public ModelAndView edit(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		String s = req.getParameter("fn");
		String s1 = req.getParameter("ln");
		String s2 = req.getParameter("mn");

		regvo v = new regvo();
		v.setId(id);
		v.setFn(s);
		v.setLn(s1);
		v.setMn(s2);

		
			d1.edit(v);
		
		String s3 = "insert done";
		return new ModelAndView("welcome", "msg", s3);

	}
}
