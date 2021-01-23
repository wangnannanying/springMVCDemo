package com.soecode.lyf.enums;

/**
 * 使用枚举表述常量数据字典
 */
public enum AppointStateEnum {
    // 如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号。而且 Java 要求必须先定义 enum 实例
    SUCCESS(1, "预约成功"), NO_NUMBER(0, "库存不足"), REPEAT_APPOINT(-1, "重复预约"), INNER_ERROR(-2, "系统异常");

    // 成员变量
    private int state;
    private String stateInfo;

    // 构造方法
    private AppointStateEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;

    }

    // get 方法
    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    // 普通方法 遍历
    public static AppointStateEnum stateOf(int index) {
        for(AppointStateEnum state : values()) {
            if(state.getState() == index) {
                return state;
            }
        }
        return null;
    }

}
