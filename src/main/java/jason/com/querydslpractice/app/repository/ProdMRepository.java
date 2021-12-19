package jason.com.querydslpractice.app.repository;

import jason.com.querydslpractice.app.entity.ProdMEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdMRepository extends JpaRepository<ProdMEntity, String> {
}
