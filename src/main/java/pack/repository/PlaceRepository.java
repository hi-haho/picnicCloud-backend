package pack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pack.entity.PlaceEntity;

public interface PlaceRepository extends JpaRepository<PlaceEntity, Integer>{
	
	//ī�װ��� ���. ������ ����������, ���� ���������� ���ƿ� ���� ����������. 
	@Query("select p from PlaceEntity as p where p.pCategory = :pCategory order by p.point desc, p.like_cnt desc")
	List<PlaceEntity> findBypCategory(@Param("pCategory") String pCategory);
	
	//��� Ű����˻�

}
