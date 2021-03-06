CREATE TABLE IF NOT EXISTS tb_dlock(
    lock_id    INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '锁id',
    lock_name  VARCHAR(128) NOT NULL DEFAULT '' COMMENT '锁名',
    lock_desc  VARCHAR(128) DEFAULT '' COMMENT '锁备注信息',
    update_at  DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '锁更新时间',

    PRIMARY KEY (lock_id),
    UNIQUE KEY uidx_lock_name (lock_name) USING BTREE
) COMMENT = '分布式锁表';