package pers.xin.adapter.test;

import pers.xin.adapter.impl.EarPhoneAdapter;
import pers.xin.adapter.impl.EarPhone;
import pers.xin.adapter.impl.Iphone7;

/**
 * 需要做到的是用手机去适配
 */
public class Main {

    public static void main(String[] args) {
        Iphone7 iphone7 = new Iphone7();//我的手机--实现了lighting接口
        EarPhoneAdapter earPhoneAdapter = new EarPhoneAdapter();//适配器实现了lighting接口
        EarPhone earPhone = new EarPhone();//我的耳机实现了EarPhoneHole接口
        boolean couldBeUse = iphone7.lightingInterfaceType() == earPhone.earPhoneHoleInterfaceType();
        String string = "";
        if (couldBeUse) {
            string = "iphone可以使用我的耳机";
        } else {
            string = "iphone不可以使用我的耳机";
        }
        System.out.println(string);
        //适配器对lightingInterfaceType与earPhoneHoleInterfaceType进行了适配
        couldBeUse = earPhoneAdapter.lightingInterfaceType() == earPhone.earPhoneHoleInterfaceType();
        if (couldBeUse) {
            string = "iphone可以使用我的耳机";
        } else {
            string = "iphone不可以使用我的耳机";
        }
        System.out.println(string);
    }
}
