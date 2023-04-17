public interface IEstructuraArbol<T>{

    public void add(T value);

    public T get();

    public T remove();

    public int count();

    public boolean isEmpty();

}