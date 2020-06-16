package 算法.牛客;

/**
 * @author wh
 * @create 2018-10-14 12:34
 **/
public class 面试题02_实现单例模式 {
    public static class Sing {
        private volatile static Sing s = null;

        private Sing() {
        }

        public static Sing getSing() {
            if (s == null) {
                synchronized (Sing.class) {
                    if (s == null) {
                        s = new Sing();
                    }
                }
            }
            return s;
        }
    }
}
