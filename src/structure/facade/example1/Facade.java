package structure.facade.example1;

public class Facade {

    //聚合了三个需要控制的子系统
    private TV tv;
    private Light light;
    private AirCondition airCondition;


    public Facade() {
        this.tv = new TV();
        this.light = new Light();
        this.airCondition = new AirCondition();
    }

    //打开所有的电器
    public void turnOnAll(){

        tv.turnON();
        light.turnOn();
        airCondition.turnON();
    }


    //关闭所有的电器
    public void turnOffAll(){
        tv.turnOff();
        light.turnOff();
        airCondition.turnOff();
    }
}
