package main.java.traffic;

import static java.lang.Double.NaN;

public enum TyreType {
    UNKNOWN(NaN),
    SOFT(0),
    MEDIUM(1),
    HARD(2);

    public final double type;

    TyreType(double type) {
        this.type = type;
    }
}
