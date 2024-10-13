package structure.bridge.example01;

/**
 * @Author shengaojie
 * @Date 2023/7/27 09:35
 * @ClassName: Mac
 * @Description: TODO
 * @Version 1.0
 */
public class Mac extends OperatingSystem{

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("mac 操作系统：");
        videoFile.decode(fileName);
    }
}
