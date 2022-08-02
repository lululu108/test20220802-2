package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.ModelAttribute; 



@Service
@Transactional 
public class UketukeService {
	
	   @Autowired
	   private JdbcTemplate jdbcTemplate;
	   
	   public List<Uketuke> getUketukeList() {
		        List<Uketuke> uketukeList = jdbcTemplate.queryForObject("select * from java_user.uketuke", new UketukeMapper());
		        
		        return uketukeList;
	   }
@Service
@Transactional
public class UKetukeService {
	
	    @Autowired
	    private JdbcTemplate jdbcTemplate;
	    
	    public List<Uketuke> getUketukeList() {
	    	    List<Uketuke> userList = jdbcTemplate.queryForObject("select * from java_user.uketuke", new UketukeMapper());
	    	    
	    	     return userList;
	    }
}
	   public boolean insertUketuke(Model model, @ModelAttribute UketukeForm uketukeForm) {
               jdbcTemplate.update("INSERT INTO java_user.uketuke(sei_name,mei_name,nk_add,nm_add1,nm_add2,nm_add3,nk_tel,gender_no,birthday_dt,nk_mail,nk_pass) VALUES(?,?,?,?,?,?,?,?,to_timestamp(?,'yyyy-MM-dd'),?,?)",uketukeForm.getSeiName(),uketukeForm.getMeiName(),uketukeForm.getNkAdd(),uketukeForm.getNmAdd1(),uketukeForm.getNmAdd2(),uketukeForm.getNmAdd3(),uketukeForm.getNkTel(),uketukeForm.getGenderNo(),uketukeForm.getBirthdayDt(),uketukeForm.getNkMail(),uketukeForm.getNkPass());
               return true;
	   }
}	   
