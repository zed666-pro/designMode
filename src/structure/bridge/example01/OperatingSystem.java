package structure.bridge.example01;

/**
 * @Author shengaojie
 * @Date 2023/7/27 09:30
 * @ClassName: OperatingSystem
 * @Description: 抽象化角色
 * @Version 1.0
 */
public abstract class OperatingSystem {

    VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
