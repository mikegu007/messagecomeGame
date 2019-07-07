package com.message.game.model.PageBase;

/** 前台datatable传参公共类<br>
 * @Author: shenjian
 * @Desription:
 * @Date: Created in 下午5:14 2017/12/22
 * @Modified By:
 */
public class DataTableCommonParameter {

    /** 请求标识 */
    private int draw;
    /** 当前请求开始下标 */
    private int start;
    /** 每页显示条数 */
    private int length;

    /**
     * 初始化分页参数
     */
    public void init(){
        if(start<=0){
            start=1;
        }
        if(length<=0||length>10){
            length=10;
        }
    }

    public DataTableCommonParameter(){
        super();
    }

    public DataTableCommonParameter(int start,int length){
        this.start = start;
        this.length = length;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCurrentPage() {
        return  start;
    }
}
