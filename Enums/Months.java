public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int dayCount;

    private Months(int dayCount) {
        this.dayCount = dayCount;
    }

    public Months nextMonth() {
        int enumSize = values().length;
        return values()[(ordinal() + enumSize + 1) % enumSize];
    }
}
