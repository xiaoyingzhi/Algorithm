package Java基础.异常;

/**
 * Create by Wang Heng on 2019-04-11
 *
 * @author Wang Heng
 */
public class SystemException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    String errorCode = "default";

    public SystemException() {
        super();
    }

    public SystemException(Throwable e) {
        super(e);
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(String message, Throwable e) {
        super(message, e);
    }

    public SystemException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * 最常用的构造方法
     *
     * @param errorCode 错误ID
     * @param message   错误消息
     * @param e         异常信息
     */
    public SystemException(String errorCode, String message, Throwable e) {
        super(message, e);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}

