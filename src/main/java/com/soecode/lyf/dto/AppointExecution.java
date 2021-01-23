package com.soecode.lyf.dto;

import com.soecode.lyf.entity.Appointment;
import com.soecode.lyf.enums.AppointStateEnum;

/**
 * 封装预约执行后结果
 */
public class AppointExecution {
    // 图书ID
    private long bookId;

    // 预约结果状态
    private int state;

    // 状态标识
    private  String stateInfo;

    // 预约成功对象
    private Appointment appointment;

    public AppointExecution() {
    }

    // 预约失败的构造器
    public AppointExecution(long bookId, AppointStateEnum stateEnum) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    // 预约成功的构造器
    public AppointExecution(long bookId, AppointStateEnum stateEnum, Appointment appointment) {
        this.bookId = bookId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.appointment = appointment;
    }

    // 省略getter和setter方法

    @Override
    public String toString() {
        return "AppointExecution(bookId:" + bookId + ",state:" + state + ",stateInfo:" + stateInfo + "," + appointment + ")";
    }

}
