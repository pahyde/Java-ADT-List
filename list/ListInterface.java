package list;

public interface ListInterface<T> {
	
    public boolean isEmpty();
    public int size();
    public void add(T item);
    public void add(int index, T item);
    public void remove(int index);
    public T get(int index);
    public void removeAll();
    public void show();
    
}
