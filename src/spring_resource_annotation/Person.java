package spring_resource_annotation;

import javax.annotation.Resource;

import lombok.Getter;

public class Person {
	@Resource(name = "home123") 
	private City city;

	@Resource(name = "wife") 
	@Getter 
	private Wife wife;
	
	//I gave it a shot here, I must use this @Resource annotation and define this bean in the .xml file, otherwise it throws exception!
	//B/c this one is using <context:annotation-config />, you can find this line in spring.xml.
	@Resource(name = "careerCurrent") 
	@Getter
	private Career career;

    public City getCity() {
        return city;
    }

    public Wife getWife() {
        return wife;
    }

    public Career getCareer() {
        return career;
    }
	
}