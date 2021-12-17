package jason.com.querydslpractice.app.repository;

import jason.com.querydslpractice.app.entity.ProdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdReposiroty extends JpaRepository<ProdEntity, String> {
}
