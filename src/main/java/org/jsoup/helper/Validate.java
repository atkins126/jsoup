package org.jsoup.helper;

import javax.annotation.Nullable;

/**
 * Simple validation methods. Designed for jsoup internal use.
 */
public final class Validate {
    
    private Validate() {}

    /**
     * Validates that the object is not null
     * @param obj object to test
     * @throws IllegalArgumentException if the object is null
     */
    public static void notNull(@Nullable Object obj) {
        if (obj == null)
            throw new IllegalArgumentException("Object must not be null");
    }

    /**
     * Validates that the object is not null
     * @param obj object to test
     * @param msg message to include in the Exception if validation fails
     * @throws IllegalArgumentException if the object is null
     */
    public static void notNull(@Nullable Object obj, String msg) {
        if (obj == null)
            throw new IllegalArgumentException(msg);
    }

    /**
     Verifies the input object is not null, and returns that object. Effectively this casts a nullable object to a non-
     null object. (Works around lack of Objects.requestNonNull in Android version.)
     * @param obj nullable object to case to not-null
     * @return the object, or throws an exception if it is null
     * @throws IllegalArgumentException if the object is null
     */
    public static Object ensureNotNull(@Nullable Object obj) {
        if (obj == null)
            throw new IllegalArgumentException("Object must not be null");
        else return obj;
    }

    /**
     * Validates that the value is true
     * @param val object to test
     * @throws IllegalArgumentException if the object is not true
     */
    public static void isTrue(boolean val) {
        if (!val)
            throw new IllegalArgumentException("Must be true");
    }

    /**
     * Validates that the value is true
     * @param val object to test
     * @param msg message to include in the Exception if validation fails
     * @throws IllegalArgumentException if the object is not true
     */
    public static void isTrue(boolean val, String msg) {
        if (!val)
            throw new IllegalArgumentException(msg);
    }

    /**
     * Validates that the value is false
     * @param val object to test
     * @throws IllegalArgumentException if the object is not false
     */
    public static void isFalse(boolean val) {
        if (val)
            throw new IllegalArgumentException("Must be false");
    }

    /**
     * Validates that the value is false
     * @param val object to test
     * @param msg message to include in the Exception if validation fails
     * @throws IllegalArgumentException if the object is not false
     */
    public static void isFalse(boolean val, String msg) {
        if (val)
            throw new IllegalArgumentException(msg);
    }

    /**
     * Validates that the array contains no null elements
     * @param objects the array to test
     * @throws IllegalArgumentException if the array contains a null element
     */
    public static void noNullElements(Object[] objects) {
        noNullElements(objects, "Array must not contain any null objects");
    }

    /**
     * Validates that the array contains no null elements
     * @param objects the array to test
     * @param msg message to include in the Exception if validation fails
     * @throws IllegalArgumentException if the array contains a null element
     */
    public static void noNullElements(Object[] objects, String msg) {
        for (Object obj : objects)
            if (obj == null)
                throw new IllegalArgumentException(msg);
    }

    /**
     * Validates that the string is not null and is not empty
     * @param string the string to test
     * @throws IllegalArgumentException if the string is null or empty
     */
    public static void notEmpty(@Nullable String string) {
        if (string == null || string.length() == 0)
            throw new IllegalArgumentException("String must not be empty");
    }

    /**
     * Validates that the string is not null and is not empty
     * @param string the string to test
     * @param msg message to include in the Exception if validation fails
     * @throws IllegalArgumentException if the string is null or empty
     */
    public static void notEmpty(@Nullable String string, String msg) {
        if (string == null || string.length() == 0)
            throw new IllegalArgumentException(msg);
    }

    /**
     * Blow up if we reach an unexpected state.
     * @param msg message to think about
     * @throws IllegalStateException if we reach this state
     */
    public static void wtf(String msg) {
        throw new IllegalStateException(msg);
    }

    /**
     Cause a failure.
     @param msg message to output.
     @throws IllegalStateException if we reach this state
     */
    public static void fail(String msg) {
        throw new IllegalArgumentException(msg);
    }
}
