package com.chatbox.repo;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chatbox.entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long>{

	      public User findByUsernameAndPwd(String username,String pwd);
	      public User findByUsername(String username);
	    
}
