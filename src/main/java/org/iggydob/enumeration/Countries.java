package org.iggydob.enumeration;

public enum Countries {
    BULGARIA,
    UK,
    GERMANY;

    @Override
    public String toString() {
        return switch (this) {
            case BULGARIA -> "Bulgaria";
            case UK -> "UK";
            case GERMANY -> "Germany";
        };
    }
}
