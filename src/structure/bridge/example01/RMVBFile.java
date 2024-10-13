package structure.bridge.example01;

/**
 * @Author shengaojie
 * @Date 2023/7/27 09:32
 * @ClassName: RMVBFile
 * @Description: 具体的实现化角色
 * @Version 1.0
 */
public class RMVBFile implements VideoFile{

    @Override
    public void decode(String fileName) {
        System.out.println("RMVB文件：" + fileName);
    }
}
