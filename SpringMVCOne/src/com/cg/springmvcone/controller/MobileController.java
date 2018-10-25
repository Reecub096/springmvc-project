package com.cg.springmvcone.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.springmvcone.dto.Mobile;
import com.cg.springmvcone.service.iMobileService;

@Controller
public class MobileController {
		
		@Autowired
		iMobileService mobileservice;
		
		@RequestMapping(value = "/home")
		public String getAllMobile(@ModelAttribute("my") Mobile mob, Map<String, Object> model)
		{
				List<String> myList = new ArrayList<>();
				myList.add("Android");
				myList.add("iOS");
				myList.add("Windows");
				
				model.put("cato", myList);
				return "AddMobile";
		}
		
		@RequestMapping(value = "addData" ,method = RequestMethod.POST)
		public String addMobileData(@ModelAttribute("my") Mobile mobile)
		{
				//System.out.println(mobile.getMobId() + "\t" + mobile.getMobName() + "\t" + mobile.getMobPrice() + "\t" + mobile.getMobCategory() );
				//System.out.println( " Avaialable online : \t" + mobile.getMobOnline());
				mobileservice.addMobile(mobile);
				return "Success";
		}
}
