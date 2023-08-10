package com.lhm.ipms.post;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
class PostModifyRequest {
    private String title;
    private String content;
}
