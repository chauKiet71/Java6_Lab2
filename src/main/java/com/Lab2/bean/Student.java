package com.Lab2.bean;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    String name;
    boolean gender = false;
    Double marks = 0.0;
    Contact contact;
    List<String> subject;
}
