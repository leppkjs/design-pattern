package composite;

/**
 * Component의 역할 : Leaf 와 Composite 역할을 동일시하는 역할을 합니다.
 *
 * @Author leppk
 */
public abstract class Entry {
    /**
     * 컴포넌트의 이름을 출력한다.
     *
     * @return 컴포넌트 이름
     */
    public abstract String getName();

    /**
     * 컴포넌트의 크기를 반환한다.
     *
     * @return 컴포넌트 크기
     */
    public abstract int getSize();

    /**
     * 자식 컴포넌트를 추가한다.
     * @param entry 추가할 자식 컴포넌트
     * @return 자신을 반환한다.
     * @throws FileTreatmentException 현재 component가 leaf일때 발생한다.
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    /**
     * 목록을 출력한다.
     */
    public void printList(){
        printList("");
    }

    /**
     * 목록을 출력한다.
     * @param prefix 전행자
     */
    protected abstract void printList(String prefix);

    /**
     *
     * @return
     */
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

    /**
     * 파일처리 예외
     */
    private class FileTreatmentException extends RuntimeException {

        public FileTreatmentException() {}

        public FileTreatmentException(String msg) {
            super(msg);
        }

    }
}
