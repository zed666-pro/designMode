package structure.bridge.example01;

/**
 * @Author shengaojie
 * @Date 2023/7/27 09:34
 * @ClassName: Windows
 * @Description: TODO
 * @Version 1.0
 */
public class Windows extends OperatingSystem{

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        System.out.println("windows系统：");
        videoFile.decode(fileName);
    }
}
