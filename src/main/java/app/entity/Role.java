package app.entity;

public enum Role {
    USER(1), ADMIN(2);
    private int value;

    Role(int value) {
        this.value = value;
    }
}
