package all.work.course;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class courseServise {
	
	@Autowired
	private RepCourse mycourse;
	
	public List<course> getAllCourses(String TopicId)
	{
		List<course> myList = new ArrayList<> () ;
		mycourse.findByTopicId(TopicId).forEach(myList::add);
		return myList;
	}
	
	public Optional<course> getMyCourse(String id)
	{
		  return mycourse.findById(id);
	}

	public void addNew(course topic) 
	{
		mycourse.save(topic);
	}

	public void makeUpdate(String id, course topic) {
		mycourse.save(topic);
		
	}

	public void deleteCourse(String id) {
		mycourse.deleteById(id);		
	}

	
}
