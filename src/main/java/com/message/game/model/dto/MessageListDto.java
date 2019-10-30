package com.message.game.model.dto;

import com.message.game.model.PageBase.DataTableCommonParameter;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MessageListDto extends DataTableCommonParameter {

    private String sex;

    public void init(){
        int start = this.getStart();
        int length = this.getLength();
        if(start<=0){
            this.setStart(1);
        }
        if(length<=0){
            this.setLength(50);
        }
    }
}
