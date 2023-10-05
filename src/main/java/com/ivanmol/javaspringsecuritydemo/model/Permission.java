package com.ivanmol.javaspringsecuritydemo.model;

import lombok.Getter;

@Getter
public enum Permission {
    DEVELOPERS_READ("developers:read"),
    DEVELOPERS_WRITE("developers:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }
}
