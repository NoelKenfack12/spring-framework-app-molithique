package com.afhunt.blogspring.vo;

import java.util.Set;
import lombok.Data;
import com.afhunt.blogspring.models.Category;
import com.afhunt.blogspring.models.Tag;

/**
 * @author noelkenfack on 28/12/2021. Project blog
 */
@Data
public class NewsRequest {

    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;

}
