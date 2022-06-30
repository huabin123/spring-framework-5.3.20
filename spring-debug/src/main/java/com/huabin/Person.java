package com.huabin;

/**
 * @Author huabin
 * @DateTime 2022-06-30 15:03
 * @Desc
 */
public class Person {

	private Integer id;
	private String name;

	public Person() {
		System.out.println("构造方法");
	}

	//    @Autowired(required = false)
	public Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
