package com.frogwine.sbs.roomwebapp.models;

public enum Position {
    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE, KOLE;

    public String toString() {
        switch (this) {
            case CONCIERGE:
                return "Concierge";
            case HOUSEKEEPING:
                return "Housekeeping";
            case FRONT_DESK:
                return "Front Desk";
            case SECURITY:
                return "Security";
            case KOLE:
                return "KÖLE";
        }
        return "";
    }
}