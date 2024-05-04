package com.pingwit.part_12.homework.task_1;

import java.lang.reflect.Field;

public class SecretLocker {
    private final String passcode;

    public SecretLocker(String passcode) {
        this.passcode = passcode;
    }

    public String getPasscode() {
        return passcode;
    }
    }
