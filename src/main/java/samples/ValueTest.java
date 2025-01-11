package samples;

// tag::code[]
value class ValueTest {
    final int x;
    final int y;
    
    public int sum() { return x + y; }
    
    public ValueTest(int x, int y) {
        this.x = x;
        this.y = y;
        super();
        System.out.println(sum()); // 3
    }

    public static void main(String[] args) {
        new ValueTest(1, 2);
    }
}
// end::code[]
