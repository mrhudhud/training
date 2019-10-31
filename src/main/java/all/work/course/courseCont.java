package all.work.course;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import all.work.topic.Topic;

@RestController
public class courseCont {
	
	@Autowired
	private courseServise myserv;
	
	@RequestMapping("/top/{TopicId}/courses/")
	public List<course> getAll(@PathVariable String TopicId)
	{
		return myserv.getAllCourses(TopicId);
	}

	//@RequestMapping("/top/{TopicId}/courses/{id}")
	@RequestMapping("/courses/{id}/TopicId={TopicId}")
	public Optional<course> getOne(@PathVariable String id)
	{
		return myserv.getMyCourse(id);
	}
	
	//@RequestMapping(method=RequestMethod.POST,value="/top/{TopicId}/courses")
	@RequestMapping(method=RequestMethod.POST,value="/courses/TopicId={TopicId}")
	public void addCourse(@RequestBody course mycourse,@PathVariable String TopicId)
	{
		mycourse.setTopic(new Topic(TopicId,"",""));
		myserv.addNew(mycourse);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/top/{TopicId}/course/{id}")
	public void updCourse(@RequestBody course mycourse,@PathVariable String TopicId,@PathVariable String id)
	{
		mycourse.setTopic(new Topic(TopicId,"",""));
		myserv.makeUpdate(id,mycourse);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/top/{TopicID}/courses/{id}")
	public void deleteCourse(@PathVariable String id)
	{
		myserv.deleteCourse(id);
	}
}
