package kodlamaioOdev1;

import kodlamaioOdev1.business.CourseManager;
import kodlamaioOdev1.core.logging.DatabaseLogger;
import kodlamaioOdev1.core.logging.ILogger;
import kodlamaioOdev1.core.logging.MailLogger;
import kodlamaioOdev1.dataAccess.HibernateCourseDao;
import kodlamaioOdev1.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1,"Java kursu","Java","Engin Demiroğ",500);
		ILogger[] loggers = {new DatabaseLogger(), new MailLogger()};
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
	}

}
