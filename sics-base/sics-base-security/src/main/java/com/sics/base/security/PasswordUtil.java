package com.sics.base.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtil {
    private static final BCryptPasswordEncoder ENCODER = new BCryptPasswordEncoder();
    /**
     * 加密原始密码
     *
     * @param rawPassword 明文密码
     * @return 加密后的密码（BCrypt格式，包含盐和版本信息）
     */
    public static String encode(String rawPassword) {
        return ENCODER.encode(rawPassword);
    }

    /**
     * 验证原始密码与加密密码是否匹配
     *
     * @param rawPassword     明文密码
     * @param encodedPassword 加密后的密码（通常从数据库取出）
     * @return true 匹配成功，false 失败
     */
    public static boolean matches(String rawPassword, String encodedPassword) {
        return ENCODER.matches(rawPassword, encodedPassword);
    }
}
