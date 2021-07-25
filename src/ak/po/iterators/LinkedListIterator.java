package ak.po.iterators;

import ak.po.interfeces.IteratorInterface;
import ak.po.lists.LinkedList;

public class LinkedListIterator implements IteratorInterface
{
    private LinkedList list;
    private LinkedList.Node current;

    public LinkedListIterator(LinkedList l)
    {
        list = l;
        current = null;
    }

    @Override
    public void previous()
    {
        current = list.getFirst();


    }

    @Override
    public void next()
    {
        current = current.next;
    }

    @Override
    public void first()
    {
        current = list.getFirst();
    }

    @Override
    public void last()
    {
        current = list.getLast();
    }

    @Override
    public boolean isDone() {
        return current == null;
    }

    @Override
    public Object current() {
        return current.value;
    }
}
