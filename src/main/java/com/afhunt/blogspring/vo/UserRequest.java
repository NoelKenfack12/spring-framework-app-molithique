package com.afhunt.blogspring.vo;

import lombok.Data;
import com.afhunt.blogspring.models.Role;

/**
 * @author noelkenfack on 28/12/2021. Project blog
 */
@Data
public class UserRequest {

    String identity;

    String name;

    Role role;
}
