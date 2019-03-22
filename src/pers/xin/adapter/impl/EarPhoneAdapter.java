package pers.xin.adapter.impl;

import pers.xin.adapter.inter.EarPhoneHole;
import pers.xin.adapter.inter.Lighting;

/**
 * 耳机适配器将3.5mm耳机插头转换为lighting插头（耳机适配器继承耳机是不是有点怪？），而lighting插头实现了lighting接口
 * 把lightingInterfaceType返回的接口类型变为3.5mm耳机孔
 */
public class EarPhoneAdapter extends EarPhone implements Lighting {
    @Override
    public String earPhoneHoleInterfaceType() {
        return super.earPhoneHoleInterfaceType();
    }

    @Override
    public String lightingInterfaceType() {
        return earPhoneHoleInterfaceType();
    }
}
