## 综合实验 学生选课系统设计
## 实验目的
分析学生选课系统

使用GUI窗体及其组件设计窗体界面

完成学生选课过程业务逻辑编程

基于文件保存并读取数据理异常
## 实验要求
设计GUI窗体,支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作

基于事件模型对业务逻辑编程,实现在界面上支持上述操作

针对操作过程中可能会出现的各种异常,做异常处理

基于输入/输出编程,支持学生、课程、教师等数据的读写操作
## 实验过程
首先进入到登录界面，若有账号，则直接进行登录后到选课界面；

若无账号，则点击注册按钮跳转到注册界面（给按钮添加监听事件）

定义面板及gui组件，构成一个选课系统界面，包括课程名称、老师等，

学生选课后，还可在再新添选课，或进行退课操作，以及打印课程信息操作

用try{}catch（）{}进行异常处理

并可用inputStream、outputStream对数据进行读写操作。
## 核心代码
```javascript
  //登录信息
                if(name.getText().trim().equals("wdx")&&new String(password.getPassword()).trim().equals("123")){
                    JOptionPane.showMessageDialog(null, "登录成功");
//注册
        jb2.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent a) {
                // TODO Auto-generated method stub
                if(a.getSource()==jb2){
                    new Register();
                }
                
                
            }
            
        });
// ~~~~~~~~~~~~~~~~~从文件读入信息~~~~~~~~~~~~~~~~~~~~~
    public void load3(int n) {
        File file = new File("students.txt");
        FileInputStream fis;
// 将信息写回文件
    public void save3() {
        File file = new File("students.txt");
        FileOutputStream fos;
//异常处理
try {
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(courses);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
```
## 实验感想
通过这次的综合实验，更加完善了选课系统这一实验，对gui组件、异常处理、数据输入输出等有了更加深刻的掌握
