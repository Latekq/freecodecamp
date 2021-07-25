package ak.po.interfeces;

public interface ListInterface {
    int size();
    void clear();
    boolean isEmpty();

    /**
     * Dodaj na końcu listy
     * @param value
     */
    void add(Object value);

    /**
     * Dodaj po wskazanym elemencie lub na początku, jeśli index = 0
     * @param value
     * @param index
     * @throws IndexOutOfBoundsException
     */
    void add(Object value, int index) throws IndexOutOfBoundsException;

    /**
     * Zmień wskazany element
     * @param value
     * @param index
     * @throws IndexOutOfBoundsException
     */
    void set(Object value, int index) throws IndexOutOfBoundsException;

    /**
     * Zwróć wskazany element
     * @param index
     * @return
     */
    Object get(int index);

    /**
     * Usuń i zwróć wskazany element
     * @param index
     * @return
     */
    Object remove(int index);

    /**
     * Sprawdź, czy zawiera
     * @param value
     * @return
     */
    boolean contain(Object value);
}
