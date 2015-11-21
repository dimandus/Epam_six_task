public enum Month {
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

    private Month(int dayCount) {
        this.dayCount = dayCount;
    }

    public Month nextMonth() {
        int enumSize = values().length;
        return values()[(ordinal() + enumSize + 1) % enumSize];
    }
}
