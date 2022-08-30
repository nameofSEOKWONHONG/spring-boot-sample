package com.example.helloboots.user.dto;

enum ENUM_ROLE_TYPE {
    GUEST(1),
    /**
     * user : view, insert, update, delete
     */
    USER(2),
    /**
     * user-master : user + menu show hide
     */
    MASTER(4),
    /**
     * admin : system admin, user manage, company enable/disable, register company
     */
    ADMIN(8);

    private final int value;
    ENUM_ROLE_TYPE(int value) { this.value = value;}
    public int getValue() { return this.value; }
}

enum ENUM_PERMISSION_TYPE {
    VIEW(1),
    INSERT(2),
    UPDATE(4),
    DELETE(8);

    private final int value;
    ENUM_PERMISSION_TYPE(int value) { this.value = value; }
    public int getValue() { return this.value; }
}
