package structure.facade.example1;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Grandpa {
    public static void main(String[] args) {
        //爷爷想要通过智能设备更加方便快捷的控制电器
        Facade facade = new Facade();
        control(facade);
    }


    public static void control(Facade facade){
        facade.turnOnAll();

        facade.turnOffAll();
    }
    
    
    @Test
    public void test(){
        int[] nums = {3, 1, 8, 2, 5, 9};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


    }

}
