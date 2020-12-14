public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  private int correctIndex(T element) {
    int index = 0;
    while (index + 1 < size() && element.compareTo(get(index + 1)) > 0) {
      index++;
    }
    return index;
  }

  public boolean add(T element) {
    if (element == null){
      throw new IllegalArgumentException("no null elements should be added");
    }
    super.add(correctIndex(element), element);
    return true;
  }

  public void add(int index, T element) {
    if (element == null){
      throw new IllegalArgumentException("no null elements should be added");
    }
    super.add(correctIndex(element), element);
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("no null elements should be added");
    }
    T temp = super.get(index);
    super.remove(index);
    super.add(correctIndex(value), value);
    return temp;
  }

}
