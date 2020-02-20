# 需求：
1.【登录】当我执行程序的时候，系统会提示我输入用户名和密码。  
    - 输入正确的时候，系统或显示登录成功  
    - 当我输入错误的时候，系统会提示我请重新登录，并且我可以继续登录。  
    
2.【注册】当我登录成功后，系统进入主页会给我选项：（1.注册用户，0.重新登录）。  
    - 当我选1的时候，系统会提示我注册用户名，注册密码,注册完成后，系统会返回到主页
    - 当我选0的时候, 系统会重新登录。

提示：  
- `UUID.randomUUID().toString()`生成一个`String`的UUID
- `DigestUtils.md5DigestAsHex(password.getBytes())` 生成一个`String`的MD5加密后的密码

需求：
1. 【日志信息】，当我执行程序后，登录成功后会有一个菜单选项（2.成长日志）
  - 当我选中2时，系统会提示我 
    - 选择日志类型（1.天，2.月，3.年）**后端用枚举实现**
    - 当选择 1.天 时，显示输入年月日[2019-05-05]，选择 2.月 时显示输入年月[2019-05]，当选择3时显示输入年份[2019]）
    - 输入内容内容
    - 前端拿到日志类型、日期、内容后传给后端，后端存入数据库的数据有[id：UUID, createTime: String, dataType: String,  data: String, content: String]