package article.WebIde.domain.dto;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor @Builder
public class LoginDto {

    private String email;
    private String password;
}