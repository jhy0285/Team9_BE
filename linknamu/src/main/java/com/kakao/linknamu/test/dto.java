package com.kakao.linknamu.test;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class dto {
    @NotNull(message = "Name is sss")
    @Pattern(regexp = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$", message = "이메일 형식으로 작성해주세요")
    public String name;

}
