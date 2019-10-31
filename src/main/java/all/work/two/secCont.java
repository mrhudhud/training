package all.work.two;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class secCont {

	@RequestMapping("/rr")
	public String WW()
	{
		return "RT";
	}
}
