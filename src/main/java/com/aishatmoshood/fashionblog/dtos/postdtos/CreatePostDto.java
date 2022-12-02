package com.aishatmoshood.fashionblog.dtos.postdtos;

import com.aishatmoshood.fashionblog.enums.DesignType;
import com.aishatmoshood.fashionblog.enums.DesignTypeGender;
import lombok.Data;

@Data
public class CreatePostDto {
    private String postTitle;
    private String postDescription;
    private DesignType designType;
    private DesignTypeGender designTypeGender;
}
