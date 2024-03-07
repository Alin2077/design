import java.util.ArrayList;
import java.util.List;

interface MyCollection {

    MyIterator iterators();

}

interface MyIterator {
    boolean hasNext();
    Object next();
}

class MyArrayList implements MyCollection {

    private List<Object> list = new ArrayList<>();
    @Override
    public MyIterator iterators() {
        return new MyArrayListIterator();
    }

    public void add(Object o){
        list.add(o);
    }

    private class MyArrayListIterator implements MyIterator {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public Object next() {
            if(hasNext()){
                return list.get(index++);
            }
            return null;
        }
    }
}

public class IteratorsDemo {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("香蕉");
        myArrayList.add("菠萝");
        myArrayList.add("苹果");

        MyIterator iterators = myArrayList.iterators();
        while (iterators.hasNext()){
            System.out.println(iterators.next());
        }

    }

}