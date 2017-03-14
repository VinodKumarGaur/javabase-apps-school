package org.javabase.apps.controller.teacher;

import java.util.HashMap;
import java.util.Map;

import org.javabase.apps.entity.TeacherDetails;
import org.javabase.apps.service.TeacherDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "dashboard/teacher")
public class TeacherController {
	
	@Autowired
	TeacherDetailsService teacherDetailsService;
	
	@RequestMapping(method = RequestMethod.GET)
    public String studentPage() {
        return "teacher/teacher";
    }
	
	@ResponseBody
	@RequestMapping(value="add", method = RequestMethod.POST)
	public Map<String, Object> registration(@RequestBody TeacherDetails teacherDetails) {
		Map<String, Object> response= new HashMap<String, Object>();
		Boolean save = teacherDetailsService.addTeacherDetails(teacherDetails);
		
		if (save) {
			response.put("suceess", true);
	        response.put("message", "Add Teacher Sucess");
			return response;
		}else {
			response.put("error", true);
	        response.put("message", "Add Teacher Failed");
			return response;
		}
		
	}
	
	
}
