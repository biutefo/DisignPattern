package pers.xin.adapter.impl;

import pers.xin.adapter.inter.EarPhoneHole;

/**
 * 3.5mm耳机可以插入3.5mm孔，实现了3.5mm耳机接口（EarPhoneHole）
 */
public class EarPhone implements EarPhoneHole{

    @Override
    public String earPhoneHoleInterfaceType() {
        return "3.5mm耳机孔";
    }
}
