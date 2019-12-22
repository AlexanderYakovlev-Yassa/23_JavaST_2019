package logic;

import enums.Color;

public interface IColorable {

    public default Color getColor() {
        return null;
    };
}
