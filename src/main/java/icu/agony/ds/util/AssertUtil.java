package icu.agony.ds.util;

/**
 * @author LiuYun
 * @version 1.0
 */
public final class AssertUtil {
    private AssertUtil() {}

    public static void isTrue(boolean expression) {
        isTrue(expression, null);
    }

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void isFalse(boolean expression) {
        isFalse(expression, null);
    }

    public static void isFalse(boolean expression, String message) {
        if (expression) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void isNUll(Object obj) {
        isNUll(obj, null);
    }

    public static void isNUll(Object obj, String message) {
        if (obj != null) {
            throw new NullPointerException(message);
        }
    }

    public static void notNUll(Object obj) {
        notNUll(obj, null);
    }

    public static void notNUll(Object obj, String message) {
        if (obj == null) {
            throw new NullPointerException(message);
        }
    }
}
