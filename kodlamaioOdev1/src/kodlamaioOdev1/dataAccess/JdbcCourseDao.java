package kodlamaioOdev1.dataAccess;

import kodlamaioOdev1.entities.Course;

public class JdbcCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile course eklendi");
		
	}

}
