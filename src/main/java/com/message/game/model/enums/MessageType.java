package com.message.game.model.enums;

import java.util.Objects;

/**
 * @author Mike
 */
public enum MessageType {

    reply(new Byte("0"), "reply", "回复性短信"),
    rubbish(new Byte("1"), "rubbish", "垃圾短信"),
    common(new Byte("2"), "common", "常规短信"),
    nothing(new Byte("3"), "nothing", "无意义短信")

    ;

    private Byte statusCode;
    private String nameEN;
    private String nameCN;

    MessageType(Byte statusCode, String nameEN, String nameCN) {
        this.statusCode = statusCode;
        this.nameEN = nameEN;
        this.nameCN = nameCN;
    }

    public Byte getStatusCode() {
        return statusCode;
    }

    public String getNameEN() {
        return nameEN;
    }

    public String getNameCN() {
        return nameCN;
    }

    public static String getNameEN(Byte typeCode) {
        MessageType[] values = MessageType.values();
        for (MessageType value : values) {
            if (Objects.equals(value.statusCode, typeCode)) {
                return value.nameEN;
            }
        }
        return null;
    }

    public static String getNameCN(Byte typeCode) {
        MessageType[] values = MessageType.values();
        for (MessageType value : values) {
            if (Objects.equals(value.statusCode, typeCode)) {
                return value.nameCN;
            }
        }
        return null;
    }


}
