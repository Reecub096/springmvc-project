package com.cg.springmvcone.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcone.dao.MobileDAO;
import com.cg.springmvcone.dto.Mobile;

@Service("mobileservice")
@Transactional
public class iMobileServiceImpl implements iMobileService{
	
		@Autowired
		MobileDAO mobiledao;
		
		@Override
		public void addMobile(Mobile mobile) {
			// TODO Auto-generated method stub
			mobiledao.addMobile(mobile);
		}

		@Override
		public List<Mobile> showAllMobile() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void deleteMobile(int mobId) {
			// TODO Auto-generated method stub
		
		}

		@Override
		public Mobile searchMobile(int mobId) {
			// TODO Auto-generated method stub
			return null;
		}

}
