package com.yanfei.scaffolding.privilege.response;

/**
 * Created by : yanfei
 * Created time : 18/6/20 下午5:52
 */
public class ResponseData<T> {
    private static final long serialVersionUID = 8125672939123850928L;

    private int code;

    private String message;

    private T data;

    public static ResponseData OK() {
        return new ResponseData(Code.STATUS_CODE_OK, Message.STATUS_MESSAGE_OK);
    }

    public static<T> ResponseData<T> OK(T data) {
        return new ResponseData(Code.STATUS_CODE_OK, Message.STATUS_MESSAGE_OK, data);
    }

    public static<T> ResponseData<T> ERROR(Integer code,T data){
        return new ResponseData(code,Message.STATUS_MESSAGE_ERROR,data);
    }

    public static ResponseData<Void> ERROR() {
        return new ResponseData(Code.STATUS_CODE_ERROR, Message.STATUS_MESSAGE_ERROR);
    }

    public static ResponseData<Void> ERROR(String message) {
        return new ResponseData(Code.STATUS_CODE_ERROR, message);
    }

    public static ResponseData<Void> NOAUTH(){
        return new ResponseData(Code.STATUS_CODE_AUTH,Message.STATUS_CODE_AUTH);
    }

    public static ResponseData<Void> NOAUTH(String message){
        return new ResponseData(Code.STATUS_CODE_AUTH,message);
    }

    private ResponseData(Code code, String message) {
        this.code = code.getValue();
        this.message = message;
    }

    private ResponseData(Code code, String message, T data) {
        this.code = code.getValue();
        this.message = message;
        this.data = data;
    }

    private ResponseData(Integer code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 枚举code
     *
     * @author arjaylv
     *
     */
    public enum Code {
        STATUS_CODE_OK(200), STATUS_CODE_ERROR(-100), STATUS_CODE_AUTH(401);

        private int value;

        private Code(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {

            this.value = value;
        }
    }

    /**
     * 常量message
     *
     * @author arjaylv
     *
     */
    public interface Message {
        String STATUS_MESSAGE_OK = "OK";
        String STATUS_MESSAGE_ERROR = "ERROR";
        String STATUS_CODE_AUTH = "NO AUTH";
    }
}
