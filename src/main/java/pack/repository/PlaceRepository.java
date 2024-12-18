package pack.repository;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pack.entity.PlaceEntity;

public interface PlaceRepository extends JpaRepository<PlaceEntity, Integer>, JpaSpecificationExecutor<PlaceEntity> {

	//타입별 장소 목록 출력. 검색있을시 필터링(동적쿼리). 페이징처리
	Page<PlaceEntity> findAll(Specification<PlaceEntity> spec, Pageable pageable);
	
	//선택한 장소 1곳 상세정보.
	//좋아요 처리를 위한 메소드- 중복사용.
	Optional<PlaceEntity> findByNo(int no);

	//평점 평균 계산
	@Query("SELECT COALESCE(AVG(r.point), 0) FROM ReviewEntity r WHERE r.placeNo = :placeNo")
	float findAveragePointByPlaceNo(@Param("placeNo") int placeNo);
	
}
