package cdacproject.cdacproject.entity;


import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;

//@Entity
//@Table(name="users")
//public class User {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//	@Column(unique=true)
//	private String username;
//	private String password;
//	
//	public User() {
//		super();
//	}
//
//	public User(Long id, String username, String password) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.password = password;
//	}
//
//	public Long getId() {
//		return id;
//		
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	@Entity
	@Table(name="Users")
	public class User{
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long userId; 
		@Column(unique = true)
		private String username;
		private Long phone;
		private String email;
		private String address;
		private String password;
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(Long userId, String username, Long phone, String email, String address, String password) {
			super();
			this.userId = userId;
			this.username = username;
			this.phone = phone;
			this.email = email;
			this.address = address;
			this.password = password;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Long getPhone() {
			return phone;
		}

		public void setPhone(Long phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
}
