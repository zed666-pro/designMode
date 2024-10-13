package behavior.memento.example01;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: shengaojie
 * @create: 2023-12-12
 **/
@State(Scope.Benchmark)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)   // 预热次数和时间
@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
public class Client {

    public void fight(GameRole gameRole) throws InterruptedException {
        gameRole.vit -= 10;
        gameRole.attack -= 20;
        gameRole.def -= 0;
        TimeUnit.MILLISECONDS.sleep(100);

    }
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Benchmark
    public void test() throws InterruptedException {
        GameRole gameRole = new GameRole();
        System.out.println("战斗开始前：");
        System.out.println(gameRole);
        Memento memento = gameRole.savaMemento();
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(memento);

        fight(gameRole);
        System.out.println("战斗开始后：");
        System.out.println(gameRole);

        gameRole.recoverFromMemento(careTaker.getMemento());
        System.out.println("读档之后：");
        System.out.println(gameRole);
    }

    public static void main(String[] args) throws InterruptedException, RunnerException {
        org.openjdk.jmh.runner.options.Options opt = new OptionsBuilder()
                .include(Client.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(opt).run();
    }
}
