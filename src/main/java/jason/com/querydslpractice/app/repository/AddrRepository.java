package jason.com.querydslpractice.app.repository;

import jason.com.querydslpractice.app.entity.AddrEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddrRepository extends JpaRepository<AddrEntity, String> {
}
