package edu.javacourse.studentorder.domain;

public class CityRegisterCheckerResponse {
    private boolean existing;
    private Boolean temporal;         //классы обертки false, true, null
    //Integer i;
    //Long l;
    //Character c;

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }

    @Override
    public String toString() {
        return "CityRegisterCheckerResponse{" +
                "existing=" + existing +
                ", temporal=" + temporal +
                '}';
    }
}
