package spring_component_scan_example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Wife {
	
	@Setter @Getter
	private String name;
	
	@Setter @Getter
	private String faith;

}
