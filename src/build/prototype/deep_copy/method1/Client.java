package build.prototype.deep_copy.method1;

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
 * @description: null
 * @author: shengaojie
 * @create: 2023-12-04
 **/

@State(Scope.Benchmark)
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)   // 预热次数和时间
@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.SECONDS)
public class Client {

    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Benchmark
    public  void test1() {
        Student dingcc = new Student("dingcc");
        Teacher teacher = new Teacher("sixin");
        teacher.setStudent(dingcc);

        Teacher newTeacher = teacher.clone();
        System.out.println(teacher);
        System.out.println(newTeacher);
        System.out.println("两个student是否是同一个对象：" + (teacher.getStudent() == newTeacher.getStudent()));
    }


    public static void main(String[] args) throws RunnerException {
        org.openjdk.jmh.runner.options.Options opt = new OptionsBuilder()
                .include(Client.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(opt).run();
    }

}
