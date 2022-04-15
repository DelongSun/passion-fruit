package com.toodin.passion.util;

import java.util.UUID;

public final class UuidHelper {
    private UuidHelper() {
    }

    public static String gen() {
        return UUID.randomUUID().toString().replace("-", "").toLowerCase();
    }
}
