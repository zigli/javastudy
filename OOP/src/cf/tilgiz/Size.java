package cf.tilgiz;

public enum Size {

    VERY_SMALL("XS"), SMALL("S"), AVARAGE("M"), BIG("X"), VERY_BIG("XL");

    Size(String abbreviation) {
        this.abbrevation = abbreviation;
    }

    private String abbrevation;

    public String getAbbrevation() {
        return abbrevation;
    }
}
