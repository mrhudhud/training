package all.work.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import all.work.topic.Topic;


@Entity
public class course {
	
	@Id
	private String id;
	private String name;
	private String descrp;
	
	@ManyToOne
	private Topic topic;
	public course() {
		
	}
	
	public course(String id, String name, String descrp) {
		super();
		this.id = id;
		this.name = name;
		this.descrp = descrp;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return descrp;
	}
	public void setDesc(String descrp) {
		this.descrp = descrp;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
}
