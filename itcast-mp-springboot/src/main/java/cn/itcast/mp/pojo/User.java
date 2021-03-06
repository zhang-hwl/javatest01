package cn.itcast.mp.pojo;

import cn.itcast.mp.enums.SexEnum;
import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class User extends Model<User> {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String userName;

    @TableField(select = false,fill = FieldFill.INSERT)  //查询时不返回该字段的值,插入数据时进行填充
    private String password;

    private String name;
    private Integer age;
    @TableField(value = "email")//指定数据库表中的字段名
    private String mail;

    @TableField(exist = false)
    private String address; //数据库表中是不存在的

    @Version //乐观锁版本字段
    private Integer version;

    @TableLogic//逻辑删除字段，1删除，0未删除
    private Integer deleted;

    private SexEnum sex;//性别，枚举类型


}