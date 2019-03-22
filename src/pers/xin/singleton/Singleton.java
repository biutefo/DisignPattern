package pers.xin.singleton;

public class Singleton {

    private static Singleton instance = new Singleton();
    private static boolean flag = false;

    private Singleton() {
        synchronized (Singleton.class) {
            if (!flag) {
                flag=true;
                System.out.println("生成了一个实例。");
            } else {
                throw new RuntimeException("单例模式被侵犯！");
            }
        }
    }

    public static Singleton getInstance() {
        return instance;
    }
}
