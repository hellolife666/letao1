package com.rsr.letao.util;

/*
*   在每个set方法的后面都加了return this 指向调用者是为了方便我们调用传入参数方便
*   使用StringBuffer的append方法来链式编程。
*
*
* */
public class AjaxResult {

    private boolean success=true; //默认成功
    private String msg = "操作成功";
    private  Object object;
//    失败调用这个构造函数 传入参数
    public AjaxResult(String msg) {
        this.success=false;
        this.msg = msg;
    }

    public AjaxResult() {
    }
//    提供一个静态的获取对象的方法方便为了链式编程设置值。
    public static AjaxResult me() {
        return new AjaxResult();
    }
    public boolean isSuccess() {

        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;

    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }
}
