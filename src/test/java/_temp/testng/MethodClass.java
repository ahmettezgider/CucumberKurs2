package _temp.testng;

public class MethodClass {

    int toplam = 0;
    public int sum(int n){
        if (n>0)
            return n + sum(n-1);
        else
            return 0;
    }
}
