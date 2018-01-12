package org.katas;

import lombok.Getter;

@Getter
public class Square extends Rectangle {

    public Square(double a) {
        super(a, a);
    }

}
