package pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pack.entity.CategoryEntity;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>{
    // MarketNo가 null이 아닌 경우
    List<CategoryEntity> findByMarketNoIsNotNull();
}
