package ak.po.interfeces;


public interface IteratorInterface
{
    public void previous();
    public void next();
    public void first();
    public void last();

    /**
     * Czy wszystkie elementy zostały przejrzane?
     *
     * Zwraca:
     * true - jeśli element aktualny nie jest określony
     * false - jeśli element aktualny jest określony
     * @return
     */
    public boolean isDone();
    public Object current();
}