package jason.com.querydslpractice.app.repository;

import jason.com.querydslpractice.app.entity.RegEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegRepository extends JpaRepository<RegEntity, String> {
}
