package all.work.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class topicServise {
	
	@Autowired
	private MyRep mytopics;
	
	public List<Topic> getAllTopics()
	{
		List <Topic> myList= new ArrayList <>();
		mytopics.findAll().forEach(myList::add);;
		return myList;
	}
	
	public Optional<Topic> getMyTopic(String id)
	{
		  return mytopics.findById(id);
	}

	public void addNew(Topic topic) 
	{
		mytopics.save(topic);
	}

	public void makeUpdate(String id, Topic topic) {
		mytopics.save(topic);
		
	}

	public void deleteTop(String id) {
		mytopics.deleteById(id);		
	}
}
