package com.cnlive.shockwave.info;

/**
 * @author 陈硕
 * @time 2017/2/24  17:19
 * @desc ${TODD}
 */
public class FragmentInfo {


    //顶部的标题
    public String title;
    //顶部标题对应的类
    public Class aClass;

    public FragmentInfo(String title, Class aClass) {
        this.title = title;
        this.aClass = aClass;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }
}
