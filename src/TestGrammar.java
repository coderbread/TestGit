public class TestGrammar {
    public static void main(String[] args) {
        //通过对象，调用普通对象
        TestGrammar tg = new TestGrammar();
        tg.printInfo();
        System.out.println(tg.add(1,2) + 10);
    }
    void printInfo(){
        System.out.println("我的天");
    }
    int add(int a, int b){
        return a + b;
    }
    
}
