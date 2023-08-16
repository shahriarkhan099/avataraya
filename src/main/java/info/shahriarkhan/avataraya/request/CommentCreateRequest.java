package info.shahriarkhan.avataraya.request;

import lombok.Data;

@Data
public class CommentCreateRequest {

    Long id;
    String text;
    Long userId;
    Long postId;

}
