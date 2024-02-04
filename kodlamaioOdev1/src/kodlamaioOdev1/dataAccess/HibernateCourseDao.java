package kodlamaioOdev1.dataAccess;

import kodlamaioOdev1.entities.Course;

public class HibernateCourseDao implements ICourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile course eklendi");
		
	}

}
