public class NoNullArrayList<T> extends ArrayList<T>{

  public boolean add(T element) {
    if (element == null){
      throw IllegalArgumentException("no null elements should be added");
    }
  }

  public void add(int index, T element) {
    if (element == null){
      throw IllegalArgumentException("no null elements should be added");
    }
  }

  public T set(int index, T element){
    if (element == null){
      throw IllegalArgumentException("no null elements should be added");
    }
  }

}
