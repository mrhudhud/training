package all.work.topic;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicCont {
	
	@Autowired
	private topicServise myserv;
	
	@RequestMapping("/top")
	public List<Topic> mytopic(){
		return myserv.getAllTopics();
	}
	
	
	@RequestMapping("/top/{id}")
	public Optional<Topic> getOne(@PathVariable String id)
	{
		return myserv.getMyTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/top")
	public void addTop(@RequestBody Topic topic)
	{
		myserv.addNew(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/top/{id}")
	public void updTop(@RequestBody Topic topic,@PathVariable String id)
	{
		myserv.makeUpdate(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/top/{id}")
	public void deleteTop(@PathVariable String id)
	{
		myserv.deleteTop(id);
	}
}
