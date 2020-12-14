public class NoNullArrayList<T> extends ArrayList<T>{

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T element) {
    if (element == null){
      throw new IllegalArgumentException("no null elements should be added");
    }
  }

  public void add(int index, T element) {
    if (element == null){
      throw new IllegalArgumentException("no null elements should be added");
    }
  }

  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("no null elements should be added");
    }
  }

}
