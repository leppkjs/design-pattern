package iterator;

public class Book {
    /**
     * 책이름
     */
    private final String name;

    /**
     * 기본생성자
     * @param name 책이름
     */
    public Book(String name) {
        this.name = name;
    }

    /**
     * 책이름을 반환한다.
     *
     * @return 책이름
     */
    public String getName() {
        return name;
    }
}
