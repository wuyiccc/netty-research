package io.netty.example.study.server.codec;

import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

/**
 * @author wuyiccc
 * @date 2022/10/7 18:16
 */
public class OrderFrameDecoder extends LengthFieldBasedFrameDecoder {
    public OrderFrameDecoder() {
        super(Integer.MAX_VALUE, 0, 2, 0, 2);
    }
}
