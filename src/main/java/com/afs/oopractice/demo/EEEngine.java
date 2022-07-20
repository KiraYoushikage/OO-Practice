package com.afs.oopractice.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public enum EEEngine {

    GASONLINE(120),
    Electric(20);


    int speed;
}
