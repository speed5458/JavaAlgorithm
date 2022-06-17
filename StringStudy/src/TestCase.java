import java.util.*;

public class TestCase {
    public static void main(String[] args){
        TestCase T = new TestCase();
        System.out.println(DFS(10));

    }

    public static int DFS(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return DFS(n-1) + DFS(n - 2);

    }
}
