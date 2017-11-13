package builder;

/**
 *
 */
public abstract class Builder {
    /**
     *
     * @param title
     */
    public abstract void makeTitle(String title);

    /**
     *
     * @param str
     */
    public abstract void makeString(String str);

    /**
     *
     * @param items
     */
    public abstract void makeIems(String[] items);

    /**
     *
     */
    public abstract void close();
}
