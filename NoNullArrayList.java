import java.util.ArrayList;
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
    super.add(element);
    return true;
  }

  public void add(int index, T element) {
    if (element == null){
      throw new IllegalArgumentException("no null elements should be added");
    }
    super.add(index, element);
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("no null elements should be added");
    }
    return (super.set(index, value));
  }

}
