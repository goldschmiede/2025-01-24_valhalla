package samples;

// tag::code[]
public value class ArrayCursor<T> {
    private final T[] array;
    private final int offset;

    public ArrayCursor(T[] array, int offset) {
        this.array = array;
        this.offset = offset;
    }

    public boolean hasNext() { 
        return offset < array.length;
    }

    public T get() { 
        return array[offset];
    }

    public ArrayCursor<T> advance() { 
        return new ArrayCursor(array, offset+1);
    }
}
// end::code[]
