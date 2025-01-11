package samples;

// tag::code[]
class IdentityTest {
    final int x;
    final int y;
    
    public int sum() { return x + y; }
    
    public IdentityTest(int x, int y) {
        System.out.println(sum()); // 0
        this.x = x;
        System.out.println(sum()); // 1
        this.y = y;
        System.out.println(sum()); // 3
    }

    public static void main(String[] args) {
        new IdentityTest(1, 2);
    }
}
// end::code[]
