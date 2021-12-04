package jason.com.querydslpractice.app.repository;


import jason.com.querydslpractice.app.entity.RcpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RcpRepository extends JpaRepository<RcpEntity, String> {

}
