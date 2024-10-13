package behavior.mediator;

/**
 * @Author shengaojie
 * @Date 2023/8/1 16:21
 * @ClassName: MediatorStructure
 * @Description: TODO
 * @Version 1.0
 */
public class MediatorStructure implements Mediator{
    //中介者中需要有各个同事
    private HouseOwner houseOwner;
    private Tenant tenant;

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    //同事之间的关系管理
    @Override
    public void contact(String message, Person person) {
        if(person instanceof Tenant){
            houseOwner.getMessage(message);
        }else if(person instanceof HouseOwner){
            tenant.getMessage(message);
        }else{
            System.out.println("do nothing");
        }
    }
}
