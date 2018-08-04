package cn.lingnan.edu.lvcity.model;

public class UsersDTO {
	private int id;
	private String name;
	private String passwd;
	private int age;
	private String phone;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UsersDTO [id=" + id + ", name=" + name + ", passwd=" + passwd + ", age=" + age + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	public UsersDTO(int id, String name, String passwd, int age, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.passwd = passwd;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	public UsersDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
