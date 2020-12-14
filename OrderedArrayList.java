public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  private int correctIndex(T element) {
    int index = 0;
    for (int i = 0; i < size(); i++) {
      if (element.compareTo(get(index + 1)) > 0) {
        index++;
      }
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
    super.add(index, element);
  }

  public T set(int index, T value){
    if (value == null){
      throw new IllegalArgumentException("no null elements should be added");
    }
    return (super.set(index, value));
  }

}
