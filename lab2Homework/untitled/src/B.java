public class B {
    private A a;
    private C[] cArray;

    public B(A a, C[] cArray) {
        this.a = a;
        this.cArray = cArray;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public C[] getCArray() {
        return cArray;
    }

    public void setCArray(C[] cArray) {
        this.cArray = cArray;
    }
}