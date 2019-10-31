package all.work.one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class oneCont {

	@RequestMapping("/hello")
	public String Printing()
	{
		return "hi hi";
	}
	


}
