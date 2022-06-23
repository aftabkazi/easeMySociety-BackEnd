package cdacproject.cdacproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cdacproject.cdacproject.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
//	public Student findByStudentId(Long id);
	public User findByUserId(Long id);
	

}
