package com.service;

import java.util.List;

import com.bean.Classes;
import com.dao.ClassesDao;



public class ClassesService {
	ClassesDao cd = new ClassesDao();
    
    public String storeClassesDetails(Classes classes) {
        if(cd.storeClasses(classes)>0) {
            return "Classes details stored successfully";
        }else {
            return "Classes details didn't store";
        }
	}
	
	public List<Classes> getAllClasses() {
	    return cd.findAllClasses();
	}

	public List<Classes> getAllClassesSubject() {
	    return cd.findClassesSubject();
	}

}
