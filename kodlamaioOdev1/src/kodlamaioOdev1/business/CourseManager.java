package kodlamaioOdev1.business;

import java.util.ArrayList;

import kodlamaioOdev1.core.logging.ILogger;
import kodlamaioOdev1.dataAccess.ICourseDao;
import kodlamaioOdev1.entities.Course;

public class CourseManager {
	ICourseDao courseDao;
	ILogger[] loggers;
	ArrayList<String> courseNames = new ArrayList<String>(); // Databaseden çekilmeli
	ArrayList<String> courseCategories = new ArrayList<String>(); //Databaseden çekilmedi
	
	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers  =loggers;
	}
	public void add(Course course) throws Exception {
		if(course.getCoursePrice() < 0) {
			throw new Exception("Kurs ücreti 0'dan küçük olamaz");
		}
		
		if(courseNames.contains(course.getName())){
			throw new Exception("Kurs ismi zaten var");
		}
		
		if(courseCategories.contains(course.getCategory())){
			throw new Exception("Kurs kategorisi zaten var");
		}
		
		courseDao.add(course);
		for (ILogger logger : loggers) {
			logger.log(course.getName());
		}
		
	}
}
