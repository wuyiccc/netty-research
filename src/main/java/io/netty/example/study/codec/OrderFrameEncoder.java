package io.netty.example.study.codec;

import io.netty.handler.codec.LengthFieldPrepender;

/**
 * @author wuyiccc
 * @date 2022/10/7 18:41
 */
public class OrderFrameEncoder extends LengthFieldPrepender {

    public OrderFrameEncoder() {
        super(2);
    }
}
