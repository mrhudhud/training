package all.work.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RepCourse extends CrudRepository <course,String> {

	public List<course> findByTopicId(String ID);
}
