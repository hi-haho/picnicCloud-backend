package pack.dto;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pack.entity.PlaceEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlaceDto {

	private int no; 
	
	private String placeType;
    private String name;
    private String address;
    private Boolean likeIs;
    private Integer likeCnt;
    private float point;
    private String image;
    private String description;
    private String tel;
    private String entranceFee;
    private String operationTime;
    private int reviewCount;

    
    private List<LikesPlaceDto> likes; // 좋아요 목록
    
    //toEntity: dto > entity
    public static PlaceEntity toPlaceEntity(PlaceDto dto) {
    	return PlaceEntity.builder()
    			.no(dto.getNo())
    			.placeType(dto.getPlaceType())
    			.name(dto.getName())
    			.address(dto.getAddress())
    			.likeIs(dto.getLikeIs())
    			.likeCnt(dto.getLikeCnt())
    			.point(dto.getPoint())
    			.image(dto.getImage())
    			.description(dto.getDescription())
    			.tel(dto.getDescription())
    			.entranceFee(dto.getEntranceFee())
    			.operationTime(dto.getOperationTime())
    			.reviewCount(dto.getReviewCount())
//    			.likes(dto.getLikes() != null ? 
//    				dto.getLikes().stream()
//    					.map(LikesPlaceDto::toLikesPlaceEntity)
//    					.collect(Collectors.toList()) : Collections.emptyList())
    			.build();
    			
    }
}
