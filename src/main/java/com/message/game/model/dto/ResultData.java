package com.message.game.model.dto;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ResultData<T> implements Serializable{

        private static final long serialVersionUID = -1L;

        private int status;

        private String errCode;

        private String errMsg;

        private T data;

        public static final int SUCCESS = 1;

        public static final int FAIL = 0;
}
