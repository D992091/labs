import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyList<Type> implements Iterable<Type> {

    private Type[] arrayList;
    private int currentSize;

    public MyList(ArrayList<Visitable> visitableList) {
        this.arrayList = (Type[]) visitableList.toArray(new Visitable[0]);
        this.currentSize = arrayList.length;
    }

    @Override
    public Iterator<Type> iterator() {
        Iterator<Type> it = new Iterator<Type>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && arrayList[currentIndex] != null;
            }

            @Override
            public Type next() {
                return arrayList[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}