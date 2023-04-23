package com.alibou.school;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private String firstname;
    private String lastname;
    private String email;
}
