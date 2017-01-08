package spring_component_scan_example;

import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Repository;

@Repository
@ToString
public class City {
	@Getter
	private String cityName;
	
	@Getter
	private String area;

}