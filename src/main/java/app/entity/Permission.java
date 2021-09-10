package app.entity;

public enum Permission {
    READ(1), EDIT(2);
    private int value;

    Permission(int value) {
        this.value = value;
    }
}
