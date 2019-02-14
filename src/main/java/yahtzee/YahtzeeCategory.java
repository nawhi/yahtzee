package yahtzee;

public enum YahtzeeCategory {
    Ones("Ones");

    private final String displayName;

    YahtzeeCategory(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return displayName;
    }
}
