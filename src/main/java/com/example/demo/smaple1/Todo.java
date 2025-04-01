package com.example.demo.smaple1;

import lombok.*;
@ToString// 개발자를 위한 어노테이션
@Getter
@Setter
@AllArgsConstructor
public class Todo {
    private int tno;
    private String title;
    private boolean finish;

}
