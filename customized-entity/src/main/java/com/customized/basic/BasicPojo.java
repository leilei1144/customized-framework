package com.customized.basic;

import java.io.Serializable;

/**
 * Created by grant on 16/9/6.
 */
public class BasicPojo implements Serializable {
    private String userID;        //用户id ， 必须.
    private String platform;      //操作系统平台，取值为android或iOS
    private String deviceID;      //设备唯一ID，iOS平台为IDFA，android平台等于imei
    private String phoneVen;      //移动运营商，1：中国移动，2：中国联通，3：中国电信，0：其它
    private String systemVersion; //操作系统版本号
    private String deviceType;    //设备型号（手机机型）
    private String channel;       //客户端渠道号
    private String clientVersion; //客户端APP版本号
    private String signature;     //统一的客户端校验标示（按照请求参数key排序后，拼接上校验码后MD5）
    private String serverVersion; //接口版本号
    private String accessToken;   //token
    private int pageNum;
    private int pageSize;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getPhoneVen() {
        return phoneVen;
    }

    public void setPhoneVen(String phoneVen) {
        this.phoneVen = phoneVen;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }


    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "BasicPojo{" +
                "userID='" + userID + '\'' +
                ", platform='" + platform + '\'' +
                ", deviceID='" + deviceID + '\'' +
                ", phoneVen='" + phoneVen + '\'' +
                ", systemVersion='" + systemVersion + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", channel='" + channel + '\'' +
                ", clientVersion='" + clientVersion + '\'' +
                ", signature='" + signature + '\'' +
                ", serverVersion='" + serverVersion + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
