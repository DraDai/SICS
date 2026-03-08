package com.sics.user.infra.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("sys_user")
public class UserDO {
    /**
     * 主键ID (使用雪花算法生成)
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 登录账号
     */
    private String username;

    /**
     * 加密密码
     */
    private String passwordHash;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像URL
     */
    private String avatar;

    /**
     * 性别：0未知 1男 2女
     */
    private Integer userGender;

    /**
     * 手机号
     */
    private String userPhone;

    /**
     * 邮箱
     */
    private String userEmail;

    /**
     * 用户状态：1在线 2离线 3异常 4注销
     */
    private Integer status;

    /**
     * 软删除标志：false未删除 true已删除
     */
    @TableLogic  // 逻辑删除字段（若需要 MyBatis-Plus 自动处理逻辑删除）
    private Boolean deleted;

    /**
     * 创建人ID
     */
    private Long createdBy;

    /**
     * 更新人ID
     */
    private Long updatedBy;


    private OffsetDateTime createdAt;

    /**
     * 更新时间 (自动填充 INSERT_UPDATE)
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private OffsetDateTime updatedAt;
}
