package behavior.mediator;

/**
 * @Author shengaojie
 * @Date 2023/8/1 16:24
 * @ClassName: Client
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        MediatorStructure mediatorStructure = new MediatorStructure();
        Tenant tenant = new Tenant("zhangsan", mediatorStructure);
        HouseOwner houseOwner = new HouseOwner("lisi", mediatorStructure);
        mediatorStructure.setTenant(tenant);
        mediatorStructure.setHouseOwner(houseOwner);

        tenant.contact("我想要租一个两室一厅的房子");
        houseOwner.contact("我正好有一个两室一厅的房子");
    }
}
