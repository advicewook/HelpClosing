package cau.capstone.helpclosing.FCM;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FCMTokenRequest {

    String email;
    String FCMToken;
}
