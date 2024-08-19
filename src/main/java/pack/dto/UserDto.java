package pack.dto;

import jakarta.persistence.*;
import lombok.*;
import pack.entity.FilesEntity;
import pack.entity.FleamarketEntity;
import pack.entity.UserEntity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto{

    @Id
    private Integer no;

    @Column(unique = true)
    private String id;

    private String pw;
    private String name;
    private Boolean gender;
    private String email;
    private String address;
    private Integer childAge;
    private Boolean userStat;
    private Boolean signoutIs;
    private LocalDateTime signUpDate;

    @Column(unique = true)
    private Integer kakaoNo;

    private String kakaoEmail;
    private String profileImageUrl;
    private String accessToken;
    private String refreshToken;
    private LocalDateTime tokenExpiration;

    private List<Integer> mNo; //마켓 번호
    private List<Integer> fNo; //파일 번호
    
 // UserDto를 UserEntity로 변환하는 메서드
    public static UserEntity toEntity(UserDto dto) {
        if (dto == null) {
            return null;
        }

        UserEntity userEnti = UserEntity.builder()
                .no(dto.getNo())
                .id(dto.getId())
                .pw(dto.getPw())
                .name(dto.getName())
                .gender(dto.getGender())
                .email(dto.getEmail())
                .address(dto.getAddress())
                .childAge(dto.getChildAge())
                .userStat(dto.getUserStat())
                .signoutIs(dto.getSignoutIs())
                .signUpDate(dto.getSignUpDate())
                .kakaoNo(dto.getKakaoNo())
                .kakaoEmail(dto.getKakaoEmail())
                .profileImageUrl(dto.getProfileImageUrl())
                .accessToken(dto.getAccessToken())
                .refreshToken(dto.getRefreshToken())
                .tokenExpiration(dto.getTokenExpiration())
                .build();
        return userEnti;
    }
    
}