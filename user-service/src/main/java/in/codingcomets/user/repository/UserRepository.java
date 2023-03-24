package in.codingcomets.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.codingcomets.user.entity.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long> {

}
