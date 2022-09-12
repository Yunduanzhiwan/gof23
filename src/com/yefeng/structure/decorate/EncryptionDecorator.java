package com.yefeng.structure.decorate;

import java.util.Base64;

/**
 * @author 夜枫
 * <p>
 * 加密包装
 */
public class EncryptionDecorator extends DataSourceDecorator {
    EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    /**
     * 解密
     *
     * @param data 加密源数据
     * @return 解密数据
     */
    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }

    /**
     * 加密
     *
     * @param data 待加密源
     * @return 加密数据
     */
    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

}
