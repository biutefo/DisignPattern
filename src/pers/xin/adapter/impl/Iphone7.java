package pers.xin.adapter.impl;

import pers.xin.adapter.inter.Lighting;

/**
 * 苹果手机从7开始取消3.5毫米耳机孔，支持lighting接口耳机。
 */
public class Iphone7 implements Lighting {

    @Override
    public String lightingInterfaceType() {
        return "lighting";
    }
}
