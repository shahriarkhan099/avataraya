package info.shahriarkhan.avataraya.response;

import info.shahriarkhan.avataraya.entity.Comment;
import lombok.Data;

@Data
public class CommentResponse {

    Long id;
    Long userId;
    String userName;
    String text;

    public CommentResponse(Comment entity) {
        this.id = entity.getId();
        this.userId = entity.getUser().getId();
        this.userName = entity.getUser().getUserName();
        this.text = entity.getText();
    }
}
